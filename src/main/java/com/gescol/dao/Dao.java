package com.gescol.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T, PK> extends Serializable {

	T findByPrimaryKey(PK id);
	List<T> findAll();
	T save(T entity);
	void delete(T entity);
	T update(T entity);

}

