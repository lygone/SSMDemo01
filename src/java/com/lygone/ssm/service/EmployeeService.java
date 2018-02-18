package com.lygone.ssm.service;

import com.lygone.ssm.domain.Employee;

import java.util.List;

/**
 * Created by panyi on 2018/2/17.
 */
public interface EmployeeService {
    public void addEmployee(Employee employee);
    public List<Employee> showEmpsByDeptId(String deptId);
}
