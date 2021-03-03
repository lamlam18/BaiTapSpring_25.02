package com.myclass.repository;

import java.util.List;

import com.myclass.entity.Role;

public interface BaseRepository<T , K> {
	List<T> findAll();

	void save(T entity);

	void remove(K id);

	T findById(K id);
	
	void update(T entity);
}
