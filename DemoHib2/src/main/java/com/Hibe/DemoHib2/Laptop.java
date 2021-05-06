package com.Hibe.DemoHib2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lName;
	@ManyToMany
	private List<Student> student=new ArrayList<Student>();
//	@ManyToOne
//	private Student student;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
	
}
