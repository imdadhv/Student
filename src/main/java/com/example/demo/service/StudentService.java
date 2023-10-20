package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    StudentDTO findById(long id);

    List<Student> findAll();

    Student deleteById(long id);

    Student deleteByEntity(Student student);

    Student edit(long id, Student student);
}
