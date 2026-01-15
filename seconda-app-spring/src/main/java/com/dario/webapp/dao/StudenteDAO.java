package com.dario.webapp.dao;

import com.dario.webapp.entity.Studente;

public interface StudenteDAO {
	
	void save(Studente studente);
	
	Studente findbyID(Integer id);
	
	void delete(Integer id);

}
