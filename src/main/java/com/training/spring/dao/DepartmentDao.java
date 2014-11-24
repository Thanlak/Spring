package com.training.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hibernate.annotation.entity.Department;

@Repository
public class DepartmentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public Department fidnDepartment(Integer id) {
		
		return hibernateTemplate.get(Department.class, id);
		
	}
	
	public List<Department> findAllDepartmentAll() {
		
		return hibernateTemplate.find("from Department");
		
	}
	
	
	//----------------------INSERT-------------------------------------	
	
	public void saveDepartmentSave(Department department) {
		hibernateTemplate.save(department);
	}
	
	
	//------------------------UPDATE---------------------------------
	
/*	public void updateDepartmentUpdate(Department department) {
		
		hibernateTemplate.update(department);
	}*/
	
	//----------------------Delete---------------------------------
	
	/*public void deleteDepartmentDelete(Department department) {
		
		hibernateTemplate.delete(department);
	}
	
	*/
	
	
	
	
	
	
	
}
