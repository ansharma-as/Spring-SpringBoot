package com.strontium.LearningAPIs.controller;

import com.strontium.LearningAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4L, "ansh" , "ansh@hmail.com");
    }
}
