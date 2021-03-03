package com.myclass.service;

import java.util.List;

import com.myclass.dto.TaskDto;

public interface TaskService {

	List<TaskDto> findAll();

	int delete(int id);

	int add(TaskDto dto);

	TaskDto findById(int id);

	int edit(TaskDto dto);

}
