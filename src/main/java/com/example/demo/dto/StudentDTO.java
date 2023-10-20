package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDTO {
    String name;
    String surname;
    @JsonIgnore
    String address;
    int age;

}
