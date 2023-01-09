package com.demo.Inheritance.SingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contract")
public class Contract extends Employee {
	private int charges;
	public Contract() {
		// TODO Auto-generated constructor stub
	}
	public Contract(int charges) {
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
