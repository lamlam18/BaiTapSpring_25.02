package com.myclass.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.myclass.dto.UserDto;
import com.myclass.entity.User;
import com.myclass.repository.UserRepository;

@Repository
@Scope("prototype")
@Transactional (rollbackOn = Exception.class)
public class UserRepositoryImpl extends BaseRepositoryImpl<User, Integer> implements UserRepository{

	public UserRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, User.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		
		return super.findAll();
	}
	
	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}
	
	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		super.remove(id);
	}
	
	@Override
	public void save(User entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}
	
	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}


}
