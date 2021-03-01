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
public class UserRepositoryImpl implements UserRepository{

	private SessionFactory sessionFactory;
	public UserRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<User>();
		Session session = sessionFactory.getCurrentSession();
		Query<User> query = session.createQuery("FROM User" , User.class);
		
		userList = query.getResultList();
		return userList;
	}

	public void save(User entity) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
	}

	public void remove(int id) {		
		Session session = sessionFactory.getCurrentSession();
		User entity = session.find(User.class, id);
		session.remove(entity);
		
	}
	
	public User findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(User.class, id);
	}

}
