package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    Student findById(long id);

    List<Student> findAll();
}
