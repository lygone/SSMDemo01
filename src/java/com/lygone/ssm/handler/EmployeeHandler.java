package com.lygone.ssm.handler;

import com.lygone.ssm.domain.Employee;
import com.lygone.ssm.service.DepartmentService;
import com.lygone.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created by panyi on 2018/2/17.
 */
@Controller
@RequestMapping(value = "/emp")
public class EmployeeHandler {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Employee employee,Map<String,Object> map){
        String message="添加用户失败";
        try {
            employeeService.addEmployee(employee);
            message="添加用户成功";
        }catch (Exception e){
            e.printStackTrace();
        }
        map.put("message",message);
        return "emp/message";
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(Map<String,Object> map)
    {
        map.put("depts",departmentService.findAllDepts());
        return "emp/add";
    }
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String showdepartment(Map<String,Object> map){
        map.put("depts",departmentService.findAllDepts());
        return null;
    }
    @RequestMapping(value = "/selectByDeptId",method = RequestMethod.POST)
    public String showEmpsByDeptId(String deptId,Map<String,Object> map){
        map.put("emps",employeeService.showEmpsByDeptId(deptId));
        return "dept/empsByDeptId";
    }
}
