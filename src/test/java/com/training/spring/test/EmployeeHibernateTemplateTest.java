package com.training.spring.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Department;
import com.hibernate.annotation.entity.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:hibernate.xml"})
public class EmployeeHibernateTemplateTest {

	@Autowired
	private HibernateTemplate hibernateTemplate;    // เป็นคลาส คลาสหนึ่ง ที่สร้างไว้ เป็น tempate เฉยๆ
	
//	@Test
//	public void testGetEmployeeByPk() {
//		System.out.println(hibernateTemplate);
//		
//		// Get the employee using spring
//		Employee employee = hibernateTemplate.get(Employee.class, 1);
//		
//		System.out.println("\nfirstname : " + employee.getFirstname());
//		System.out.println("lastname :" + employee.getLastname());
//		System.out.println("\n");
//		
//	}
//	
//	@Test
//	public void testFindEployeeWithHSQL(){
//		
//		List<Employee> employeeList = hibernateTemplate.find("from Employee");
//		
//		for(Employee employee : employeeList){
//			System.out.println("firstname : " + employee.getFirstname()
//					+ " lastname :" + employee.getLastname()
//					+ " Salary :" + employee.getSalaly());
//		}	
//	}
//	
//	@Test
//	public void testFindDepartmentWithHSQL(){
//		
//		List<Department> departments = hibernateTemplate.find("from Department");
//		
//		for(Department department : departments){
//			System.out.println("\ndepartment : " + department.getName());
//					
//		}
//	}
//		
//	@Test
//	public void testFindDepartmentWithHSQLByParameter(){
//		
//		List<Employee> employeeList = hibernateTemplate.find("from Employee where id = ?" , new Integer[]{3});
//		
////		for(Employee employee : employeeList){					//แบบที่ 1
////			System.out.println("\nfirstname : " + employee.getFirstname()
////					+ " lastname :" + employee.getLastname()
////					+ " Salary :" + employee.getSalaly());
////			
////		}	
//		
//		displayEmployee(employeeList); // แบบที่ 2
//		
//	}
	
//	private void displayEmployee(List<Employee> employeeList) {
//		
//		for(Employee employee : employeeList){
//			System.out.println("\nfirstname : " + employee.getFirstname()
//					+ " lastname :" + employee.getLastname()
//					+ " Salary :" + employee.getSalaly());
//			
//		}
//	}
	
//	@Test
//	public void testFindEployeeWithNameQuery(){
//		
//		List<Employee> employeeList = hibernateTemplate.findByNamedQuery("findAllEmployee");
//		displayEmployee(employeeList);
//
//	}
	
//	@Test
//	public void testFindEployeeWithCriteria(){
//		
//		DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
//		criteria.add(Restrictions.eq("firstname", "Jonh"));
//		
//		List<Employee> employeeList = hibernateTemplate.findByCriteria(criteria);
//		displayEmployee(employeeList);
//
//	}
	
//	@Test
//	public void testSaveEmployee(){
//		
//		Employee employee = new Employee();	
//		employee.setFirstname("MMM");
//		employee.setLastname("BBB");		
//		hibernateTemplate.save(employee);
//
//	}
	
//	@Test
//	public void testDeleteEmployee(){
//		
//		Employee employee = hibernateTemplate.get(Employee.class, 8);		
//		hibernateTemplate.delete(employee);
//
//	}
	
//	@Test
//	public void testUpdateEmployee(){
//		
//		Employee employee = hibernateTemplate.get(Employee.class, 12);	
//		employee.setFirstname("WA");
//		hibernateTemplate.update(employee);
//
//	}
	
	
}
	
	
	
	
	
	
	

