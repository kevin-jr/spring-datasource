package com.example.demojavacallback.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;


@Getter @Setter @AllArgsConstructor @ToString
public class Employee {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private double salary;



}
