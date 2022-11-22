package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    Employee getOneEmployee(int id);

    PageInfo<Employee> getEmployeePage(Integer pageNum);

    boolean addEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(int id);
}
