package com.krishantha.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		System.out.println("Default constructore executed");
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloaded constructore executed");
		this.employeeRepository = employeeRepository;
	}
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("setter inection fired");	
		this.employeeRepository = employeeRepository;
	}
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

}
