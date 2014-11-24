package com.training.spring.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})
public class EmployeeServiceTest {
	
	@Autowired
	private EmployeeService employeeService;
	
//	@Test
//	public void testFindEmployeeByIdShouldFoundData() throws Exception{
//		Employee employee = employeeService.findEmployee(5);
//		System.out.println(employee);
//	}
//
//	@Test
//	public void testFindAllEmployeeShouldFoundData(){
//		
//		List<Employee> employee = employeeService.findAllEmployeeAll();
//		System.out.println(employee);
//	}
	
	@Test
	public void testSaveEmployee(){
		
		Employee employee = new Employee();
		employee.setFirstname("DDDDD");
		employeeService.saveEmployee(employee);
	}
	
/*	@Test
	public void testUpdateEmployee(){
		
		Employee employee = employeeService.findEmployee(5);
		employee.setFirstname("AAA");
		employeeService.updateEmployee(employee);
		
		
	}*/
	
/*	@Test
	public void testDeleteEmployee(){
		
		Employee employee = employeeService.findEmployee(14);
		employeeService.deleteEmployee(employee);
	}*/
	
	
	
}
