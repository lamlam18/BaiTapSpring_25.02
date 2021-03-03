package com.myclass.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.myclass.entity.Role;
import com.myclass.repository.RoleRepository;

@Repository
@Scope("prototype")
@Transactional (rollbackOn = Exception.class)
public class RoleRepositoryImpl extends BaseRepositoryImpl<Role, Integer> implements RoleRepository{

	public RoleRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, Role.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	
	@Override
	public Role findById(Integer id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}
	
	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		super.remove(id);
	}
	
	@Override
	public void save(Role entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}
	
	@Override
	public void update(Role entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}
	

		
}
