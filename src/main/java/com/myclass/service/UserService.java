package com.myclass.service;

import java.util.List;

import com.myclass.dto.UserDto;
import com.myclass.entity.User;

public interface UserService {

	List<UserDto> findAll();

	int add(UserDto dto);

	int delete(int id);

}
