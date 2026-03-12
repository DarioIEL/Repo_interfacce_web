package com.dario.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dario.webapp.entity.Student;

//In questo caso vado ad estendere JpaRepository così non devo fare DAO manuali. Inoltre seguo il pattern architett di Spring vero e proprio
public interface StudentRepository extends JpaRepository<Student, Long>{

	//Questi sono i metodi che poi andrò ad implementare all'interno dei miei service
	boolean existsByEmail (String email);
}
