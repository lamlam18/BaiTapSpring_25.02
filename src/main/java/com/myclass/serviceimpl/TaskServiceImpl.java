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
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;

	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public List<TaskDto> findAll() {
		List<TaskDto> dtos = new ArrayList<TaskDto>();
		try {
			List<Task> taskList = taskRepository.findAll();
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

	public int delete(int id) {
		try {
			taskRepository.remove(id);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return -1;
	}

	public int add(TaskDto dto) {
		// TODO Auto-generated method stub
		try {
			Task entity = new Task(dto.getName(), dto.getStartDate(), dto.getEndDate(), dto.getProjectId(),
					dto.getUserId(), dto.getStatusId());
			taskRepository.save(entity);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return -1;
	}

	public TaskDto findById(int id) {
		// TODO Auto-generated method stub
		Task entity = taskRepository.findById(id);
		TaskDto dto = new TaskDto(entity.getId(), entity.getName(), entity.getStartDate(), entity.getEndDate(),
				entity.getProjectId(), entity.getUserId(), entity.getStatusId());
		return dto;
	}

	public int edit(TaskDto dto) {
		try {
			Task entity = new Task(dto.getId(), dto.getName(), dto.getStartDate(), dto.getEndDate(), dto.getProjectId(),
					dto.getUserId(), dto.getStatusId());
			taskRepository.update(entity);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return -1;
	}
}
