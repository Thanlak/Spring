package com.training.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.annotation.entity.Department;
import com.training.spring.dao.DepartmentDao;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	public Department findDepartmentById(Integer id) {
		
		return departmentDao.fidnDepartment(id);
		
	}
	
	public List<Department> findAllDepartment() {
		
		return departmentDao.findAllDepartmentAll();
		
	}
	
	
	//----------------------INSERT-------------------------------------
	
	public void saveDepartment(Department department) {
		
		departmentDao.saveDepartmentSave(department);
	}
	
	//------------------------UPDATE---------------------------------
	
	/*public void updateDepartment(Department department) {
		
		departmentDao.updateDepartmentUpdate(department);
	}*/
	
	
	//----------------------Delete---------------------------------
	
/*	public void deleteDepartment(Department department) {
		
		departmentDao.deleteDepartmentDelete(department);
	}
	*/
	
	
	
	
	
	
	
	
}
