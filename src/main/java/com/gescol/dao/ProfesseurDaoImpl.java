package com.gescol.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProfesseurDaoImpl implements ProfesseurDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Professeur findByPrimaryKey(Integer id) {
		return em.find(Professeur.class, id);
	}

	@Override
	public List<Professeur> findAll() {
		String querystring = "SELECT p FROM Professeur p" ;
		Query query = em.createQuery(querystring);
		List<Professeur> list = query.getResultList();
		return list;
	}

	@Override
	public Professeur save(Professeur entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public void delete(Professeur entity) {
		Professeur eMerged = em.merge(entity);
		em.remove(eMerged);
	}

	@Override
	public Professeur update(Professeur entity) {
		return em.merge(entity);
	}

}
