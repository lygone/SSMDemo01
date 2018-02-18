package com.lygone.ssm.dao;

import com.lygone.ssm.domain.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by panyi on 2018/2/17.
 */
@Repository(value ="departmentMapper" )
public interface DepartmentMapper {
    public void save(Department department);
    public List<Department> findAll();
    public Department findById(String deptId);
}
