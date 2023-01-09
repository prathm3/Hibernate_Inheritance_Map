package com.demo.Embeddable;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user22")
public class User {
	@Id
	private int id;
	private String name;
	@Embedded
	private Address add;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, Address add) {
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
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
}
