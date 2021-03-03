package com.myclass.controller;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myclass.dto.UserDto;
import com.myclass.entity.User;
import com.myclass.service.UserService;

@Controller
@Scope("prototype")
@RequestMapping("user")

public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(ModelMap model) {
		List<UserDto> dtos = userService.findAll();
		for (UserDto userDto : dtos) {
			System.out.println(userDto.getFullname());
		}
		model.addAttribute("userList", dtos);
		
		return "user/index";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "user/add";
	}

	public String add(ModelMap model, @RequestParam("fullname") String fullname,
			@RequestParam("password") String password, @RequestParam("email") String email,
			@RequestParam("avatar") String avatar, @RequestParam("roleId") int roleId) {
		UserDto dto = new UserDto(fullname, password, avatar, roleId, email);
		int result = userService.add(dto);
		if (result == -1) {
			model.addAttribute("message", "Thêm không thành công");
			return "rediect:/user/add";
		}
		model.addAttribute("message", "Thêm thành công");

		return "/user/index";

	}
	
	public String delete(@RequestParam("id")int id , ModelMap model) {
		 userService.delete(id);
		return "user/index";
	}

}
