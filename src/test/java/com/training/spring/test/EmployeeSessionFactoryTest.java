package com.training.spring.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hibernate.annotation.entity.Employee;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:hibernate.xml"})
public class EmployeeSessionFactoryTest {

	@Autowired
	private SessionFactory sessionfactory;
	
//	@Test
//	public void testGetSessionFromSessionFactory(){
//		
//		Session session = sessionfactory.openSession();
//		
//		Employee employee = (Employee) session.get(Employee.class, 3);
//		
//		System.out.println(employee);
//	
//		session.close();		
//	}

//	@Test
//	public void testFindHQLFirstname() {
//		
//		Session session = sessionfactory.openSession();
//		
//		List<Employee> result = session.createQuery("FROM Employee e WHERE e.firstname = 'May' and e.id = 3").list();
//		
//		System.out.println("\nFirstname : " + result);
//				
//		//released session
//		session.close();
//	}
	
	@Test
	public void testFindCriteriaFirstnameAndLastname() {
		
		Session session = sessionfactory.openSession();
		
		Criteria criteria = session.createCriteria(Employee.class);
		
		criteria.add(Restrictions.eq("firstname", "May"));
		criteria.add(Restrictions.eq("last name", "May"));
		
		
		List<Employee> result = criteria.list();
		
		System.out.println(result);
				
		//released session
		session.close();
	}
	
//	@Test
//	public void testFindByNameQuery() {
//		
//		Session session = sessionfactory.openSession();
//		
//		List<Employee> em = session.getNamedQuery("findAllEmployee").list();
//		System.out.println(em);
//		
//		session.close();
//	}
}
