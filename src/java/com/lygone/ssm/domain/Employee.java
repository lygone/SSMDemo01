package com.lygone.ssm.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by panyi on 2018/2/17.
 */
public class Employee {
    private String empId;
    private String empName;
    private Department dept;
    private Boolean gender;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date hireDate;
    private Integer salary;

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee() {
    }



    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", dept=" + dept +
                ", gender=" + gender +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                '}';
    }

    public Employee(String empId, String empName, Department dept, Boolean gender, Date hireDate, Integer salary) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.gender = gender;
        this.hireDate = hireDate;
        this.salary = salary;
    }
}
