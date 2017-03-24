package com.javaocho;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.javaocho.database.EmployeesService;
import com.javaocho.model.Employee;

@Path("employees")
public class Employees {

	EmployeesService employeeService = new EmployeesService();
	@GET
	public String getEmployeesNames(@QueryParam("sortBy")int sortedBy){	
		if(sortedBy == 1){
			return "Welcome to the jungle";
		}else if(sortedBy == 2){
			return "This is Sparta";
		}else{
			return "Martin, John is sorted by " + sortedBy;
		}		
	}
	
	
	@GET
	@Path("id/{identifier: [0-9]*}")
	public String getById(@PathParam("identifier") String myId){
		return myId;
	}
	
	
	@GET
	@Path("xml")
	@Produces("text/xml")
	public Employee getXml(){
		return new Employee(Integer.valueOf(1), "Martin");
	}
	
	@GET
	@Path("json")
    @Produces(MediaType.APPLICATION_JSON)
	public Employee getJson(){
		return new Employee(Integer.valueOf(2), "Martin");
	}
	
	@POST
	@Path("get")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(Employee employee){
		
		return employee;
	}
	
	
	
}
