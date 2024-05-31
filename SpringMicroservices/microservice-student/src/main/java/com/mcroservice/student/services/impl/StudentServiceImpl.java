package com.mcroservice.student.services.impl;

import com.mcroservice.student.entities.Student;
import com.mcroservice.student.persistence.StudentRepository;
import com.mcroservice.student.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return studentRepository.findAllStudent(idCourse);
    }
}
