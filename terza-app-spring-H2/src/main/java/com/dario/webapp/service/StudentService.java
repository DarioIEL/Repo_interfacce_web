package com.dario.webapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dario.webapp.entity.Course;
import com.dario.webapp.entity.Student;
import com.dario.webapp.repository.CourseRepository;
import com.dario.webapp.repository.StudentRepository;


//Con Transactional Spring gestisce automaticamente tutte le transazioni del database
@Service
@Transactional
public class StudentService {
//Nei service vado ad implementare le logiche di business legate alle singole entities

	//subito creo i miei repo e li inizializzo
	private final StudentRepository studentRepository;
	private final CourseRepository courseRepository;

	public StudentService(StudentRepository studentRepository, CourseRepository courseRepository) {
		this.studentRepository = studentRepository;
		this.courseRepository = courseRepository;
	}

	public List<Student> findAllStudents(){
//		JPA PURO che non utilizzo
//		public List<Student> findAll() {
//		    EntityManager em = entityManagerFactory.createEntityManager();
//		    return em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
//		}

		//In questo caso il metodo findAll() che è un metodo di Spring Data JPA mi esegue la query
		//SELECT * from students
		//Se volessi vedere le query scritte dovrei utilizzare JPA puro con gli entityManager per fare i createQuery
		return this.studentRepository.findAll();
	}

	public Student findStudentById(Long id) {
		return this.studentRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Studente non presente con questo ID"));
	}

	public Student createStudent(Student student) {
		if( studentRepository.existsByEmail(student.getEmail())) {
			throw new RuntimeException("Email già esistente");
		}
		return studentRepository.save(student);
	}


	public Student updateStudente(Long id, Student updated) {
		Student studenteEsistente = findStudentById(id);
		studenteEsistente.setFirstName(updated.getFirstName());
		studenteEsistente.setLastName(updated.getLastName());
		studenteEsistente.setEmail(updated.getEmail());

		return studentRepository.save(studenteEsistente);
	}

	public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student enrollStudentInCourse(Long studentId, Long courseId) {
        Student student = findStudentById(studentId);
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Corso non esistente con questo ID" + courseId));
        student.addCourse(course);
        return studentRepository.save(student);
    }

}
