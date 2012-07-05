package au.arvind.rd.server.rws.crud.service;

import au.arvind.rd.server.rws.crud.model.Employee;

public interface EmployeeService {
	String getDepartmentId(String empId);

	Employee getEmployee(String employeeId);
}
