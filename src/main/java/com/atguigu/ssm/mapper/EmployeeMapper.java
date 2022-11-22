package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> getAllEmployee();

    int addEmployee(Employee employee);

    Employee getOneEmployee(int id);

    int updateEmployee(Employee employee);

    int deleteEmployee(int id);
}
