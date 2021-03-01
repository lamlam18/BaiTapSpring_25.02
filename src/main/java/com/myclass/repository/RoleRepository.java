package com.myclass.repository;

import java.util.List;

import com.myclass.entity.Role;

public interface RoleRepository {

	List<Role> findAll();

	void save(Role entity);

	void remove(int id);

	Role getById(int id);

}
