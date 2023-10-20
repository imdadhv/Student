package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/save")
    public Student save(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<StudentDTO> findById(@PathVariable long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/delete")
    public Student deleteById(@Param("id") long id) {
        return studentService.deleteById(id);
    }

    @PutMapping("/edit/id/{id}")
    public Student edit(@RequestBody Student student, @PathVariable long id) {
        return studentService.edit(id, student);
    }
}
