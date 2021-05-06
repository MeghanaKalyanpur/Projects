package com.Hibe.DemoHib2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Student {
	@Id
	private int rollno;
	private String sname; 
	private int marks;
//	@ManyToMany(mappedBy = "student") //creates two tables if you donot specify mappedby
	//By default the fetch type is lazy and it doesnot invoke laptop collection until it is accessed by an object
	@OneToMany(mappedBy = "student",fetch=FetchType.EAGER) //New table is created to define relationship between student and laptop
	private List<Laptop> laptop=new ArrayList<Laptop>();
//	@OneToOne //No new table is created in the database to define relationship
//	private Laptop laptop;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	
	
}
