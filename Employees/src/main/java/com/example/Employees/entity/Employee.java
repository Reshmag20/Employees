package com.example.Employees.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empid;
    private String empName;
    private String dept;
    private Integer sal;


    public Integer getEmpid() {
        return empid;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDept() {
        return dept;
    }

    public Integer getSal() {
        return sal;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Employee(Integer empid, String empName, String dept, Integer sal) {
        this.empid = empid;
        this.empName = empName;
        this.dept = dept;
        this.sal = sal;
    }

    public Employee() {
    }
}
