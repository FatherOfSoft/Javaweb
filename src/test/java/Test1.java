import com.atguigu.ssm.controller.EmployeeController;
import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:springmvc.xml"})
public class Test1 {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeController employeeController;
    @Test
    public void testGetAllEmployee(){
        List<Employee> allEmployee = employeeService.getAllEmployee();
        allEmployee.forEach(employee -> System.out.println(employee));
    }

    @Test
    public void testInsertEmployee(){
        boolean b = employeeService.addEmployee(new Employee(null, "江停", 20, "男", "12345@qq.com"));
        System.out.println(b);
    }

    @Test
    public void testInsertController(){
         employeeController.addEmployee(new Employee(null, "江停", 20, "男", "12345@qq.com"));

    }
}
