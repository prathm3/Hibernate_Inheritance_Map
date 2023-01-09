package com.demo.Inheritance.TablePerClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Salaried")
public class Salaried1 extends Employee {
	private int sal;
	public Salaried1() {
		// TODO Auto-generated constructor stub
	}
	public Salaried1( int sal) {
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
