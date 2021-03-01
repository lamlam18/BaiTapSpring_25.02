package com.myclass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@Column(name = "fullname")
	private String	fullname;
	
	@Column(name = "id")
	private int		id;
	
	@Column(name = "password")
	private String	password;
	
	@Column(name = "avatar")
	private String	avatar;
	
	@Column(name = "roleid")
	private int		roleId;
	
	@Column(name = "email")
	private String  email;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;
	public User() {
		super();
	}
	
	
	public User(String fullname, String password, String avatar, int roleId, String email) {
		super();
		this.fullname = fullname;
		this.password = password;
		this.avatar = avatar;
		this.roleId = roleId;
		this.email = email;
	}


	public User(String fullname, int id, String password, String avatar, int roleId , String email) {
		super();
		this.fullname = fullname;
		this.id = id;
		this.password = password;
		this.avatar = avatar;
		this.roleId = roleId;
		this.email = email;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
