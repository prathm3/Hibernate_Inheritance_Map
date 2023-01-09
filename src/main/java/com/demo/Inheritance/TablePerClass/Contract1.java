package com.demo.Inheritance.TablePerClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="Contract22")
public class Contract1 extends Employee {
	private int charges;
	public Contract1() {
		// TODO Auto-generated constructor stub
	}
	public Contract1(int charges) {
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
