package au.arvind.rd.server.rws.crud.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import au.arvind.rd.server.rws.crud.model.Department;
import au.arvind.rd.server.rws.crud.model.Employee;

public class DepartmentServiveImpl implements DepartmentService {
	List<Employee> employees = new ArrayList<Employee>();
	List<Department> departments = new ArrayList<Department>();

	public DepartmentServiveImpl() {
		employees.add(new Employee("Emp001", "Arvind", 100000, "Dept001"));
		employees.add(new Employee("Emp002", "Arv", 100000, "Dept001"));
		employees.add(new Employee("Emp003", "AG", 100000, "Dept001"));
	}

	@Override
	public List<Employee> getEmployees() {
		return employees;
	}

	@Override
	public Long addDepartment(Department department) {		
		departments.add(department);
		return department.getId();
	}

	@Override
	public void deleteDepartment(Department department) {
		departments.remove(department);
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
	public List<Department> getDepartments() {
		return departments;
	}
}
