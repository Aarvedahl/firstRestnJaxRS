package com.javaocho.database;

import java.util.ArrayList;

import com.javaocho.model.Employee;

public class EmployeesService {

	
	ArrayList<Employee>listOfEmployees = new ArrayList<>();
	
	public ArrayList<Employee> getListOfEmployees() {
		return listOfEmployees;
	}
	
	public void deleteEmployee(Employee employee){
		listOfEmployees.remove(employee);
	}
	
	public void addEmployee(Employee employee){
		listOfEmployees.add(employee);
	}
	
	public void updateEmployee(Employee employee){
		
	}
	
}
