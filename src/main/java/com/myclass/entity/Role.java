package com.myclass.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import org.hibernate.mapping.Set;

@Entity
@Table(name = "ROLE")
public class Role {
	@Id
	@Column(name = "id")
	private int		id;
	
	@Column(name = "name")
	private String	name;
	
	@Column(name = "description")
	private String	description;
	
	@OneToMany(mappedBy = "role" , fetch = FetchType.LAZY)
	private Set<User> users;
	
	public Role() {
		super();
	}
	
	public Role(String name , String description) {
		this.name = name;
		this.description = description;
	}
	
	public Role(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
