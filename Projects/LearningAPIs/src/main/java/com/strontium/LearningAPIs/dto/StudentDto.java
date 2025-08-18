package com.strontium.LearningAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto
{
    public Long id;
    public String name;
    public String email;


    // instead if making a constructor and getter and setters here we can use one Annotation @Data
    // it is coming from Lombok Dependency and it will handle all by when code in converting into byte code it will set all by itself.
//
//    public StudentDto(Long l, String name, String email) {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setName(String name){
//        this.name=name;
//    }

}
