package com.myclass.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class TaskDto {

	private int		id;
	private String	name;
	private	Date	startDate;
	private Date	endDate;
	private	int		projectId;
	private int		userId;
	private int		statusId;
	
	
	
	public TaskDto(String name, Date startDate, Date endDate, int projectId, int userId, int statusId) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectId = projectId;
		this.userId = userId;
		this.statusId = statusId;
	}
	
	public TaskDto() {
		super();
	}
	public TaskDto(int id, String name, Date startDate, Date endDate, int projectId, int userId, int statusId) {
		super();
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectId = projectId;
		this.userId = userId;
		this.statusId = statusId;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	
	
}
