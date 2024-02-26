package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentModel {
    public String id;
    public String name;
    public int age;
    public String adhar;
    public String university;

    public StudentModel(String id, String name, int age, String adhar, String university){
        this.name=name;
        this.id=id;
        this.age=age;
        this.adhar=adhar;
        this.university=university;
    }
}