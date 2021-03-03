package com.myclass.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.myclass.entity.Task;
import com.myclass.repository.TaskRepository;

@Repository
@Scope("prototype")
@Transactional(rollbackOn = Exception.class)
public class TaskRepositoryImpl extends BaseRepositoryImpl<Task, Integer> implements TaskRepository {

	public TaskRepositoryImpl(SessionFactory sessionFactory) {
		super(sessionFactory, Task.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Task> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	
	@Override
	public void remove(Integer id) {
		// TODO Auto-generated method stub
		super.remove(id);
	}
	
	@Override
	public void save(Task entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}
	
	@Override
	public void update(Task entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}
	
	@Override
	public Task findById(Integer id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}
	
	
	

}
