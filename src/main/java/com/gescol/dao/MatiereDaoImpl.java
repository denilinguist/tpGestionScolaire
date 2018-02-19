package com.gescol.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gescol.model.Matiere;
import com.music.model.Album;

@Repository
@Transactional
public class MatiereDaoImpl implements MatiereDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Matiere findByPrimaryKey(String id) {
		return em.find(Matiere.class, id);
	}

	@Override
	public List<Matiere> findAll() {
		String querystring = "SELECT m FROM Matiere m" ;
		Query query = em.createQuery(querystring);
		List<Matiere> list = query.getResultList();
		return list;
	}

	@Override
	public Matiere save(Matiere entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public void delete(Matiere entity) {
		Matiere eMerged = em.merge(entity);
		em.remove(eMerged);
	}

	@Override
	public Matiere update(Matiere entity) {
		return em.merge(entity);
	}

}
