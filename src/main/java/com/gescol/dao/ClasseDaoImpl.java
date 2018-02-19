package com.gescol.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gescol.model.Classe;

@Repository
@Transactional
public class ClasseDaoImpl implements ClasseDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Classe findByPrimaryKey(String id) {
		return em.find(Classe.class, id);
	}

	@Override
	public List<Classe> findAll() {
		String querystring = "SELECT c FROM Classe c" ;
		Query query = em.createQuery(querystring);
		List<Classe> list = query.getResultList();
		return list;
	}

	@Override
	public Classe save(Classe entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public void delete(Classe entity) {
		Classe eMerged = em.merge(entity);
		em.remove(eMerged);
	}

	@Override
	public Classe update(Classe entity) {
		return em.merge(entity);
	}

}
