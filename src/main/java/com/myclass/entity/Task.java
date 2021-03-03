package com.myclass.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TASK")
public class Task {
	@Id
	@Column(name = "id")
	private int		id;
	
	@Column(name = "name")
	private String	name;
	
	@Column(name = "startDate")
	private	Date	startDate;
	
	@Column(name = "endDate")
	private Date	endDate;
	
	@Column(name = "projectId")
	private	int		projectId;
	
	@Column(name = "userId")
	private int		userId;
	
	@Column(name = "statusId")
	private int		statusId;
	
	@ManyToOne
	@JoinColumn(name = "projectId" , insertable = false , updatable =false)
	private Project project;
	
	@ManyToOne
	@JoinColumn(name = "userId" ,  insertable = false , updatable =false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "statusID" ,  insertable = false , updatable =false)
	private Status status;
	
	public Task() {
		super();
	}
	
	public Task(String name, Date startDate, Date endDate, int projectId, int userId, int statusId) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.projectId = projectId;
		this.userId = userId;
		this.statusId = statusId;
	}

	public Task(int id, String name, Date startDate, Date endDate, int projectId, int userId, int statusId) {
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
