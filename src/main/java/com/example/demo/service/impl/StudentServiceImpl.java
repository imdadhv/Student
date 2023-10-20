package com.example.demo.service.impl;


import com.example.demo.dto.StudentDTO;
import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student deleteById(long id) {
        Optional<Student> ifExists = studentRepository.findById(id);
        ifExists.ifPresent(studentRepository::delete);
        return ifExists.get();
    }

    @Override
    public List<Student> findAll() {
        return null;
    }


    @Override
    public StudentDTO findById(long id) {
        return studentRepository.findById(id).map(student -> modelMapper.map(student, StudentDTO.class))
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    @Override
    public Student deleteByEntity(Student student) {
        return null;
    }

    @Override
    public Student edit(long id, Student student) {
        Optional<Student> ifExists = studentRepository.findById(id);
        if (ifExists.isPresent()) {
            ifExists.get().setName(student.getName());
            studentRepository.save(ifExists.get());

        }
        return ifExists.get();
    }
}
