package com.myclass.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.myclass.dto.UserDto;
import com.myclass.entity.User;
import com.myclass.repository.UserRepository;
import com.myclass.service.UserService;

@Service
@Scope("prototype")
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<UserDto> findAll() {
		// TODO Auto-generated method stub
		List<UserDto> dtos = new ArrayList<UserDto>();
		try {
			List<User> entities = userRepository.findAll();
			for (User user : entities) {
				UserDto dto  = new UserDto(user.getFullname(), user.getId(), user.getPassword(), 
						user.getAvatar(), user.getRoleId(), user.getEmail());
				dtos.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return dtos;
	}

	public int add(UserDto dto) {
		try {
			User entity = new User(dto.getFullname(), dto.getPassword(), dto.getAvatar(),
					dto.getRoleId(), dto.getEmail());
			userRepository.save(entity);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return -1;
	}

	public int delete(int id) {
		try {
			userRepository.remove(id);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return -1;
	}

}
