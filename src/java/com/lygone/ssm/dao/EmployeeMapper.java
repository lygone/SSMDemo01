package com.lygone.ssm.dao;

import com.lygone.ssm.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by panyi on 2018/2/17.
 */
@Repository(value = "employeeMapper")
public interface EmployeeMapper {
    public void save(Employee employee);
    public Employee findById(String empId);
    public List<Employee> findByDeptId(String deptId);
    public List<Employee> findAll();
}
