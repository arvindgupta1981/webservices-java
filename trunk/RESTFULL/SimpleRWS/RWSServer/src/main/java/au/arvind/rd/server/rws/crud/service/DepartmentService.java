package au.arvind.rd.server.rws.crud.service;

import java.util.Collection;

import au.arvind.rd.server.rws.crud.model.Department;
import au.arvind.rd.server.rws.crud.model.Employee;

public interface DepartmentService {
	Long addDepartment(Department department);
	void deleteDepartment(Department department);
	Department modifyDepartment(Department department);
	Department getDepartment(Long id);
	Collection<Department> getDepartments();
	Collection<Employee> getEmployees();
}
