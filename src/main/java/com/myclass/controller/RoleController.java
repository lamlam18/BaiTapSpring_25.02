package com.myclass.controller;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myclass.dto.RoleDto;
import com.myclass.service.RoleService;

@Controller
@Scope("prototype")
@RequestMapping("role")
public class RoleController {
	private RoleService roleService;
	public RoleController(RoleService roleService) {
		this.roleService = roleService;
	}
	
	@RequestMapping(value = "" , method = RequestMethod.GET)
	public String index(ModelMap model) {
		List<RoleDto> dtos = roleService.getAll();
		for (RoleDto dto : dtos) {
			System.out.println(dto.getName());
		}

		model.addAttribute("listRole", dtos);
		return "role/index";
	}
	
	@RequestMapping(value = "add" , method = RequestMethod.GET)
	public String add() {
		return "role/add";
	}
	
	@RequestMapping(value = "add" , method = RequestMethod.POST)
	public String add(@RequestParam("name")String name , @RequestParam("description")String description) {
		RoleDto dto = new RoleDto(name, description);
		roleService.add(dto);
		return "redirect:/role";
	}
	
	@RequestMapping(value = "delete" , method = RequestMethod.GET)
	public String delete(ModelMap model ,@RequestParam("id")int id) {
		int result =  roleService.delete(id);
		if (result == -1) {
			model.addAttribute("message", "Xóa thất bại");
			return "role/index";
		}
		
		model.addAttribute("message", "Xóa thành công");
		return "role/index";
	}
	
	@RequestMapping(value = "edit" , method = RequestMethod.GET)
	public String edit(ModelMap model , @RequestParam("id")int id) {
		RoleDto dtos =  roleService.findById(id);
		if (dtos == null) {
			model.addAttribute("message", "Id không hợp lệ");
			return "role/index";
		}
		model.addAttribute("role", dtos);
		return "role/edit";	
	}
	
	public String edit(ModelMap model ,@RequestParam("id")int id, @RequestParam("name")String name , @RequestParam("description")String description) {
		RoleDto dto = new RoleDto(id, name, description);
		roleService.edit(dto);
		return description;
		
	}
	
	
}
