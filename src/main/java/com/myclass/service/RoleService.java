package com.myclass.service;

import java.util.List;

import com.myclass.dto.RoleDto;

public interface RoleService {

	List<RoleDto> getAll();

	int add(RoleDto dto);

	int delete(int id);

	RoleDto findById(int id);

	int edit(RoleDto dto);

}
