package com.myclass.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.myclass.entity.Task;
import com.myclass.repository.BaseRepository;

public class BaseRepositoryImpl<T , K> implements BaseRepository<T, K> {
	private SessionFactory sessionFactory;
	private Class<T> clazz;
	
	public BaseRepositoryImpl(SessionFactory sessionFactory , Class<T>  clazz) {
		this.sessionFactory = sessionFactory;
		this.clazz = clazz;
		
	}
	
	public List<T> findAll() {
		// TODO Auto-generated method stub
		List<T> userList = new ArrayList<T>();
		Session session = sessionFactory.getCurrentSession();
		Query<T> query = session.createQuery("FROM " + clazz.getSimpleName() , clazz);
		
		userList = query.getResultList();
		return userList;
	}

	public void save(T entity) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
	}

	public void remove(K id) {		
		Session session = sessionFactory.getCurrentSession();
		T entity = session.find(clazz, id);
		session.remove(entity);
		
	}
	
	public T findById(K id) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(clazz, id);
	}

	public void update(T entity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);

	}

}
