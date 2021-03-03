package com.myclass.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.myclass.dto.RoleDto;
import com.myclass.entity.Role;
import com.myclass.repository.RoleRepository;
import com.myclass.service.RoleService;

@Service
@Scope("prototype")
public class RoleServiceImpl implements RoleService{
	
	private RoleRepository roleRepository;
	public RoleServiceImpl(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public List<RoleDto> getAll() {
		// TODO Auto-generated method stub
		List<RoleDto> dtos = new ArrayList<RoleDto>();
		try {
			List<Role> entities = roleRepository.findAll();
			for (Role role : entities) {
				RoleDto dto = new RoleDto(role.getId(), role.getName(), role.getDescription());
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dtos;
	}

	public int add(RoleDto dto) {
		// TODO Auto-generated method stub
		Role entity = new Role( dto.getName(), dto.getDescription());
		try {
			roleRepository.save(entity);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return -1;
	}

	public int delete(int id) {
		try {
			roleRepository.remove(id);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return -1;
	}

	public RoleDto findById(int id) {
		// TODO Auto-generated method stub
		 roleRepository.findById(id);
		return null;
	}

	public int edit(RoleDto dto) {
		// TODO Auto-generated method stub
		try {
			Role role = roleRepository.findById(dto.getId());
			if (role == null)
				return -1;
			role.setName(dto.getName());
			role.setDescription(dto.getDescription());
			roleRepository.save(role);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return -1;

	}

}
