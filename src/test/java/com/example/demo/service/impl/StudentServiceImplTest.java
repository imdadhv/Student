package com.example.demo.service.impl;

import com.example.demo.dto.StudentDTO;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {
    @Mock
    private StudentRepository studentRepository;
    @Mock
    private ModelMapper modelMapper;
    @InjectMocks
    private StudentServiceImpl studentService;
    private Student student;
    private StudentDTO studentDTO;

    @BeforeEach
    void setUp() {
//        student = Student.builder().
//                id(1L)
//                .name("Imdad")
//                .surname("Hasanov")
//                .age(21)
//                .address("Kurdamir")
//                .build();

        studentDTO = StudentDTO.builder()
                .name("Imdad")
                .surname("Hasanov")
                .age(21)
                .address("Kurdamir")
                .build();
    }

    @AfterEach
    void tearDown() {
        student = null;
    }

    @Test
    void findById() {
        when(studentRepository.findById(anyLong())).thenReturn(Optional.of(student));

        when(modelMapper.map(student, StudentDTO.class)).thenReturn(studentDTO);

        StudentDTO studentResult = studentService.findById(1L);

        assertThat(studentResult.getName()).isEqualTo("Imdad");

        verify(studentRepository, times(1)).findById(anyLong());



    }

    @Test
    void deleteById() {
    }

    @Test
    void findAll() {
    }


    @Test
    void deleteByEntity() {
    }

    @Test
    void edit() {
    }
}