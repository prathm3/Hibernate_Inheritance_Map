package com.demo.Inheritance.JoinTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name="Emp2_sal")
@PrimaryKeyJoinColumn(name="sid")
public class Salaried2 extends Employee {
	private int sal;
	public Salaried2() {
		// TODO Auto-generated constructor stub
	}
	public Salaried2( int sal) {
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
