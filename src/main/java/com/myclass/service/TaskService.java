package com.myclass.service;

import java.util.List;

import com.myclass.dto.TaskDto;

public interface TaskService {

	List<TaskDto> findAll();

}
