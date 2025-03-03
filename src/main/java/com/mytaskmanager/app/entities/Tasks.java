package com.mytaskmanager.app.entities;

import java.io.Serializable;

import java.time.LocalDateTime;



import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;



@Entity
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long taskId;

	private String taskName;

	private LocalDateTime taskStartDate;

	private LocalDateTime taskEndDate;

	public Long getTaskId() {

		return taskId;

	}

	public void setTaskId(Long taskId) {

		this.taskId = taskId;

	}

	public String getTaskName() {

		return taskName;

	}

	public void setTaskName(String taskName) {

		this.taskName = taskName;

	}

	public LocalDateTime getTaskStartDate() {

		return taskStartDate;

	}

	public void setTaskStartDate(LocalDateTime taskStartDate) {

		this.taskStartDate = taskStartDate;

	}

	public LocalDateTime getTaskEndDate() {

		return taskEndDate;

	}

	public void setTaskEndDate(LocalDateTime taskEndDate) {

		this.taskEndDate = taskEndDate;

	}

	
	@Override
	public String toString()
	{
		return "[ taskName:"+taskName+" ]";
	}

}







