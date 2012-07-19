package au.arvind.rd.server.rws.crud.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import au.arvind.rd.server.rws.crud.model.Department;
import au.arvind.rd.server.rws.crud.model.Employee;

public class DepartmentServiveImpl implements DepartmentService{
	Collection<Employee> employees = new ArrayList<Employee>();
	Collection<Department> departments = new ArrayList<Department>();
	
	public DepartmentServiveImpl(){
		employees.add(new Employee("Emp001", "Arvind", 100000,"Dept001"));
		employees.add(new Employee("Emp002", "Arv", 100000,"Dept001"));
		employees.add(new Employee("Emp003", "AG", 100000,"Dept001"));
	}
	@Override
	public Collection<Employee> getEmployees() {
		return employees;
	}
	@Override
	public Long addDepartment(Department department) {
		long timeInMillis = Calendar.getInstance().getTimeInMillis();
		department.setId(timeInMillis);
		return timeInMillis;
	}
	@Override
	public void deleteDepartment(Department department) {
		
	}
	@Override
	public Department modifyDepartment(Department department) {
		return null;
	}
	@Override
	public Department getDepartment(Long id) {
		return null;
	}
	@Override
	public Collection<Department> getDepartments() {
		return departments;
	}
}
