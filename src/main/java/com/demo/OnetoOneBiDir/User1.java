package com.demo.OnetoOneBiDir;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user33")
public class User1 {
	@Id
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "aid")
	private Address1 add;
	public User1() {
		// TODO Auto-generated constructor stub
	}
	public User1(int id, String name, Address1 add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address1 getAdd() {
		return add;
	}
	public void setAdd(Address1 add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
}
