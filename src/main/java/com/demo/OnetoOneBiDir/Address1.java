package com.demo.OnetoOneBiDir;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="add33")
public class Address1 {
	
	@Id
	private int aid;
	private String city;
	
	@OneToOne(mappedBy = "add", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private User1 u;
	public Address1() {
		// TODO Auto-generated constructor stub
	}
	public Address1(int aid, String city, User1 u) {
		super();
		this.aid = aid;
		this.city = city;
		this.u = u;
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
	public User1 getU() {
		return u;
	}
	public void setU(User1 u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", u=" + u + "]";
	}
	
}
