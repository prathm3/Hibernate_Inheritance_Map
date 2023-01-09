package com.demo.OnetoMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user44")
public class User2 {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy = "u" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Address2> set = new HashSet<>();
	public User2() {
		// TODO Auto-generated constructor stub
	}
	public User2(int id, String name, Set<Address2> set) {
		super();
		this.id = id;
		this.name = name;
		this.set = set;
	}
	public User2(int i, String string) {
		id =i;
		name = string;
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
	public Set<Address2> getSet() {
		return set;
	}
	public void setSet(Set<Address2> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "User2 [id=" + id + ", name=" + name + ", set=" + set + "]";
	}
	
}
