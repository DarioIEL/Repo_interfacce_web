package com.dario.webapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dario.webapp.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

//	Optional è un metodo di query derivata di Spring Data JPA
// Praticamente questo metodo genera automaticamente una query di questo tipo
// SELECT * FROM courses WHERE title = ? LIMIT 1;
// Poi nel service viene implementato per bene
	Optional<Course> findByTitle(String title);

}
