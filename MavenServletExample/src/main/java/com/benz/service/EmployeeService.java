package com.benz.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.benz.entity.Employee;
import com.benz.util.HibernateConfig;

public final class EmployeeService {

	private static EmployeeService employeeService = null;

	private EmployeeService() {
	}

	public static EmployeeService getEmployeeService() {
		if (employeeService == null) {
			employeeService = new EmployeeService();
		}
		return employeeService;
	}

	Session session = HibernateConfig.getHibernateconfig();

	public void saveEmployee(Employee employee) {
		Transaction transaction = session.beginTransaction();
		System.out.println("Transaction: " + transaction);
		transaction.begin();
		session.save(employee);
		System.out.println("Employee saved...............");
		transaction.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
		List<Employee> list = session.createCriteria(Employee.class).list();
		/*
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
*/		return list;
	}

	public Employee getEmployee(int empId) {
		Employee employee = (Employee) session.get(Employee.class, empId);
		return employee;
	}

	public void getDelectEmployee() {
		Employee employee = new Employee();
		employee.setId(1);
		session.delete(employee);
	
	}
	public void getUpdateEmployee(){
	employeeService.getAllEmployees();
	}

}
