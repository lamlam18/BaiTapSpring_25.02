package com.myclass.dto;

public class UserDto {
	private String	fullname;
	private int		id;
	private String	password;
	private String	avatar;
	private int		roleId;
	private String email;
	
	
	public UserDto(String fullname, String password, String avatar, int roleId, String email) {
		super();
		this.fullname = fullname;
		this.password = password;
		this.avatar = avatar;
		this.roleId = roleId;
		this.email = email;
	}
	public UserDto() {
		super();
	}
	public UserDto(String fullname, int id, String password, String avatar, int roleId, String email) {
		super();
		this.fullname = fullname;
		this.id = id;
		this.password = password;
		this.avatar = avatar;
		this.roleId = roleId;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
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
}
