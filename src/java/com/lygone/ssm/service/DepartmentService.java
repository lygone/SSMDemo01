package com.lygone.ssm.service;

import com.lygone.ssm.domain.Department;

import java.util.List;

/**
 * Created by panyi on 2018/2/17.
 */

public interface DepartmentService {
    public List<Department> findAllDepts();
}
