package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.EmployeeMapper;
import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,3);
        //查询所有的员工信息
        List<Employee> list=employeeMapper.getAllEmployee();
        //获取分页相关数据
        PageInfo<Employee> page=new PageInfo<>(list,5);
        return page;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        int i=employeeMapper.addEmployee(employee);
        return i==1;
    }

    @Override
    public Employee getOneEmployee(int id) {
        Employee employee = employeeMapper.getOneEmployee(id);
        return employee;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        int i=employeeMapper.updateEmployee(employee);
        return i==1;
    }

    @Override
    public boolean deleteEmployee(int id) {
        int i=employeeMapper.deleteEmployee(id);
        return i==1;
    }
}
