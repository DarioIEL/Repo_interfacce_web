package com.dario.webapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dario.webapp.entity.Studente;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudenteDAOImpl implements StudenteDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public StudenteDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void save(Studente studente) {
		entityManager.persist(studente);	
	}

	@Override
	public Studente findbyID(Integer id) {
		return entityManager.find(Studente.class, id);
		
	}

	@Transactional
	public void delete(Integer id) {
		Studente studenteSelezionato = entityManager.find(Studente.class, id);
		entityManager.remove(studenteSelezionato);
	}
	
	
}
