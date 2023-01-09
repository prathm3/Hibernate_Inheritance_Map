package com.demo.Embeddable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Embeddable
public class Address {
	
	private int aid;
	private String city;
	public Address(int aid, String city) {
		super();
		this.aid = aid;
		this.city = city;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + "]";
	}
	
}
