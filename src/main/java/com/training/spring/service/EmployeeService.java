package com.training.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee findEmployee(Integer id){
		
		return employeeDao.findEmployeeById(id);
		
	}
	
	public List<Employee> findAllEmployeeAll() {
		
		return employeeDao.findAllEmployee();
	}
	
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmaployeeSave(employee);
	}
	
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmaployeeUpdate(employee);
	}
	
	public void deleteEmployee(Employee employee) {
		employeeDao.deleteEmaployeeDelete(employee);
	}
	
	
	
	
	

}
