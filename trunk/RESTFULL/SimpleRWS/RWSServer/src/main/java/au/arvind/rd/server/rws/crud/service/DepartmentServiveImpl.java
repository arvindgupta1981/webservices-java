package au.arvind.rd.server.rws.crud.service;

import java.util.ArrayList;
import java.util.Collection;

import au.arvind.rd.server.rws.crud.model.Employee;

public class DepartmentServiveImpl implements DepartmentService{
	Collection<Employee> employees=new ArrayList<Employee>();
	public DepartmentServiveImpl(){
		employees.add(new Employee("Emp001", "Arvind", 100000,"Dept001"));
		employees.add(new Employee("Emp002", "Arv", 100000,"Dept001"));
		employees.add(new Employee("Emp003", "AG", 100000,"Dept001"));
	}
	@Override
	public Collection<Employee> getEmployees() {
		return employees;
	}

}
