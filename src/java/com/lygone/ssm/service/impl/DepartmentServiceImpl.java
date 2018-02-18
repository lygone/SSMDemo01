package com.lygone.ssm.service.impl;

import com.lygone.ssm.dao.DepartmentMapper;
import com.lygone.ssm.domain.Department;
import com.lygone.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

/**
 * Created by panyi on 2018/2/17.
 */
@Service("departmentService")
@Transactional
public class DepartmentServiceImpl  implements DepartmentService{


    @Autowired
    private DepartmentMapper departmentMapper;
    public List<Department> findAllDepts()
    {
       List<Department> departments=departmentMapper.findAll();
        Iterator it=departments.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        return departmentMapper.findAll();
    }
}
