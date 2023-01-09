package com.demo.ManytoMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="user55")
public class User3 {
	@Id
	private int id;
	private String name;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name="userAdd55", joinColumns = {@JoinColumn(name="uid")},
	inverseJoinColumns = {@JoinColumn(name = "u3")})
	private Set<Address3> set = new HashSet<>();
	public User3() {
		// TODO Auto-generated constructor stub
	}
	public User3(int id, String name, Set<Address3> set) {
		super();
		this.id = id;
		this.name = name;
		this.set = set;
	}
	public User3(int i, String string) {
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
	public Set<Address3> getSet() {
		return set;
	}
	public void setSet(Set<Address3> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "User2 [id=" + id + ", name=" + name + ", set=" + set + "]";
	}
	
}
