package com.demo.Inheritance.JoinTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name="Emp2_con")
@PrimaryKeyJoinColumn(name = "cid")
public class Contract2 extends Employee {
	private int charges;
	public Contract2() {
		// TODO Auto-generated constructor stub
	}
	public Contract2(int charges) {
		super();
		this.charges = charges;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Contract [charges=" + charges + "]";
	}
	
	
	
}
