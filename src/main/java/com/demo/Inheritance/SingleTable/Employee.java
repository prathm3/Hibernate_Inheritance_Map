package com.demo.Inheritance.SingleTable;

import javax.annotation.processing.Generated;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name ="Emp11")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Employee_type", discriminatorType = DiscriminatorType.STRING)
public class Employee {
	@Id
	@GeneratedValue
	private int empid;
	private String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
}
