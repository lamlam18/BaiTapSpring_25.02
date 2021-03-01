package com.myclass.repository;

import java.util.List;

import com.myclass.dto.UserDto;
import com.myclass.entity.User;

public interface UserRepository {

	List<User> findAll();

	void save(User entity);

	void remove(int id);

}
