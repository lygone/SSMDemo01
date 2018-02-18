package com.lygone.ssm.service.impl;

import com.lygone.ssm.dao.EmployeeMapper;
import com.lygone.ssm.domain.Employee;
import com.lygone.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by panyi on 2018/2/17.
 */
@Service(value="employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,rollbackFor = {Exception.class,RuntimeException.class})
    public void addEmployee(Employee employee) {

        employeeMapper.save(employee);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED,rollbackFor = {Exception.class,RuntimeException.class})
    public List<Employee> showEmpsByDeptId(String deptId){
        List<Employee> emps=employeeMapper.findByDeptId(deptId);
        return emps;
    }
}
