package com.demo.ManytoMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="add55")
public class Address3 {
	
	@Id
	private int aid;
	private String city;
	@ManyToMany(mappedBy = "set" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<User3> u3 = new HashSet<>();
	public Address3() {
		// TODO Auto-generated constructor stub
	}
	
	public Address3(int aid, String city, Set<User3> u3) {
		super();
		this.aid = aid;
		this.city = city;
		this.u3 = u3;
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
	
	public Set<User3> getU3() {
		return u3;
	}

	public void setU3(Set<User3> u3) {
		this.u3 = u3;
	}

	@Override
	public String toString() {
		return "Address2 [aid=" + aid + ", city=" + city + ", u=" + u3 + "]";
	}
	
	
}
