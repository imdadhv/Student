package com.example.demo.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import lombok.experimental.FieldDefaults;
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Table
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    String surname;
    String address;
    int age;

}
