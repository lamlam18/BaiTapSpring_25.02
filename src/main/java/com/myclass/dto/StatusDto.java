package com.myclass.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class StatusDto {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	public StatusDto() {
		super();
	}

	public StatusDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;

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


}
