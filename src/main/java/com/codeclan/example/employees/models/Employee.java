package com.codeclan.example.employees.models;

import javax.persistence.*;

@Entity
@Table(name="employees")

public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="employeeNo")
    private String employeeNo;

    @Column(name="email")
    private String email;

    public Employee(String name, int age, String employeeNo, String email) {
        this.name = name;
        this.age = age;
        this.employeeNo = employeeNo;
        this.email = email;
    }

    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
