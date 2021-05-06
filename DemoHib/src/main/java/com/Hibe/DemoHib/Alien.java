package com.Hibe.DemoHib;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="alien_table")// customized table name
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
	@Id
	private int aid;
//	@Transient //Temporary data
	private String aname;
//	private AlienName aname;
	@Column(name="alien_color") //specific column name
	private String colour;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
//	public AlienName getAname() {
//		return aname;
//	}
//	
//	public void setAname(AlienName aname) {
//		this.aname = aname;
//	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", colour=" + colour + "]";
	}
	
	
}
