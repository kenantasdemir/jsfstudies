package com.kenant42.jsfstudies.entities;

import lombok.Setter;

@Setter
public class Employee {
    private int id;
    private String name;
    private int age;

    private String department;
    private Long salary;
}
