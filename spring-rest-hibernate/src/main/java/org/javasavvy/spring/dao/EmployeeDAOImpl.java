package org.javasavvy.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.javasavvy.spring.entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("employeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceContext
	public EntityManager entityManager;
	
	@Transactional(readOnly=false)
	public Employee addEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

	@Transactional(readOnly=false)
	public Employee updateEmployee(Employee employee) {
		entityManager.merge(employee);
		return employee;
	}

	@Transactional(readOnly=false)
	public void deleteEmployee(Employee employee) {
		entityManager.remove(employee);
	}

	@Transactional(readOnly=true)
	public Employee getEmployee(long empId) {
		String sql = "select emp from Employee emp where emp.employeeId="+empId;
		try{
			return (Employee) entityManager.createQuery(sql).getSingleResult();
		}catch(Exception e){
		}
		return null;
	}

	@Transactional(readOnly=true)
	public List<Employee> getAllEmployees() {
		return entityManager.createQuery("select emp from Employee emp").getResultList();
	}

}
