package com.myclass.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.myclass.dto.TaskDto;
import com.myclass.entity.Task;
import com.myclass.repository.TaskRepository;
import com.myclass.service.TaskService;

@Service
@Scope("prototype")
public class TaskServiceImpl implements TaskService{
	
	private TaskRepository taskRepository;
	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public List<TaskDto> findAll() {
		List<TaskDto> dtos = new ArrayList<TaskDto>();
		try {
			List<Task> taskList = taskRepository.getAll();
			for (Task task : taskList) {
				TaskDto dto = new TaskDto(task.getId(), task.getName(), task.getStartDate(), task.getEndDate(),
											task.getProjectId(), task.getUserId(), task.getStatusId());
				dtos.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dtos;
	}
	
	

}
