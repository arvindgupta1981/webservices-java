package au.arvind.rd.server.rws.crud.service;

import java.util.List;

import au.arvind.rd.server.rws.crud.model.Department;
import au.arvind.rd.server.rws.crud.model.Employee;

public interface DepartmentService {
	Long addDepartment(Department department);
	void deleteDepartment(Department department);
	Department modifyDepartment(Department department);
	Department getDepartment(Long id);
	List<Department> getDepartments();
	List<Employee> getEmployees();
}
