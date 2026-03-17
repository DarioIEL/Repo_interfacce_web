package com.dario.webapp.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dario.webapp.entity.Course;
import com.dario.webapp.entity.Student;
import com.dario.webapp.repository.StudentRepository;
import com.dario.webapp.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentRepository studentRepository;

    private final StudentService studentService;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findStudentById(id);
    }
//    public ResponseEntity<StudentDTO> getStudent(@PathVariable Long id){
//    	return studentRepository.findById(id)
//    			.map(this::convertToDTO)
//    			.map(ResponseEntity::ok)
//    			.orElse(ResponseEntity.notFound().build());
//    }
//    
//    private StudentDTO convertToDTO(Student student) {
//    	List<String> titles = student.getCourses().stream()
//    			.map(Course::getTitle)
//    			.collect(Collectors.toList());
//    	return new StudentDTO(student.getId(), student.getFirstName(), student.getLastName(), student.getEmail(), titles);
//    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student created = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudente(id, student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{studentId}/enroll/{courseId}")
    public Student enrollStudentInCourse(@PathVariable Long studentId,
                                         @PathVariable Long courseId) {
        return studentService.enrollStudentInCourse(studentId, courseId);
    }
}
