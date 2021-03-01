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
@Transactional (rollbackOn = Exception.class)
public class TaskRepositoryImpl implements TaskRepository{
	
	private SessionFactory sessionFactory;
	public TaskRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<Task> getAll() {
		// TODO Auto-generated method stub
		List<Task> entities = new ArrayList<Task>();
		Session session = sessionFactory.getCurrentSession();
		Query<Task> query = session.createQuery("FROM Task" , Task.class);
		entities = query.getResultList();
		return entities;
	}

}
