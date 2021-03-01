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
public class RoleRepositoryImpl implements RoleRepository{
	
	private SessionFactory sessionFactory;
	public RoleRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Role> findAll() {
		List<Role> roles = new ArrayList<Role>();
		Session session = sessionFactory.getCurrentSession();
		Query<Role> query = session.createQuery("FROM Role" , Role.class);
		roles = query.getResultList();
		
		return roles;
	}

	public void save(Role entity) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
	}

	public void remove(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Role role = getById(id);
		session.remove(role);
	}

	public Role getById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.find(Role.class, id);
	}
		
}
