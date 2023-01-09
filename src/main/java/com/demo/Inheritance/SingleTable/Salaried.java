package com.demo.Inheritance.SingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Salaried")
public class Salaried extends Employee {
	private int sal;
	public Salaried() {
		// TODO Auto-generated constructor stub
	}
	public Salaried( int sal) {
		super();
		this.sal = sal;
	}
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Salaried [ sal=" + sal + "]";
	}
	
}
