package au.arvind.rd.server.rws.crud.service;

import java.util.Collection;

import au.arvind.rd.server.rws.crud.model.Employee;

public interface DepartmentService {
	Collection<Employee> getEmployees();
}
