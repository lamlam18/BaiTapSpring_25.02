package com.myclass.controller;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myclass.dto.TaskDto;
import com.myclass.service.TaskService;

@Controller
@Scope("prototype")
@RequestMapping("task")
public class TaskController {
	private TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(ModelMap model) {
		List<TaskDto> dtos = taskService.findAll();
		model.addAttribute("taskList", dtos);
		return "task/index";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(ModelMap model, @RequestParam("id") int id) {
		int result = taskService.delete(id);
		if (result == -1) {
			model.addAttribute("message", "Xóa không thành công");
			return "redirect:/task";
		}
		model.addAttribute("message", "Xóa thành công");
		return "redirect:/task";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "task/add";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(ModelMap model, @RequestParam("name") String name, @RequestParam("startDate") Date startDate,
			@RequestParam("endDate") Date endDate, @RequestParam("projectId") int projectId,
			@RequestParam("userId") int userId, @RequestParam("statusId") int statusId) {
		TaskDto dto = new TaskDto(name, startDate, endDate, projectId, userId, statusId);
		int result = taskService.add(dto);
		if (result == -1) {
			model.addAttribute("message", "Thêm không thành công");
			return "task/add";
		}
		model.addAttribute("message", "Thêm thành công");
		return "redirect:/task";
	}

	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String edit(ModelMap model, @RequestParam("id") int id) {
		TaskDto dto = taskService.findById(id);
		if (dto == null) {
			model.addAttribute("message", "Id không tồn tại");
			return "redirect:/task";
		}
		model.addAttribute("task", dto);
		return "task/edit";
	}

	public String edit(ModelMap model, @RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("startDate") Date startDate, @RequestParam("endDate") Date endDate,
			@RequestParam("projectId") int projectId, @RequestParam("userId") int userId,
			@RequestParam("statusId") int statusId) {

		TaskDto dto = new TaskDto(id, name, startDate, endDate, projectId, userId, statusId);
		int result = taskService.edit(dto);
		if (result == -1) {
			model.addAttribute("message", "Edit không thành công");
			return "task/edit";
		}
		model.addAttribute("message", "Edit thành công");
		return "redirect:/task";
	}

}
