package au.arvind.rd.server.rws.crud.service;

import au.arvind.rd.server.rws.crud.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public String getDepartmentId(String empId) {
		return "Dept001";
	}	
	@Override
	public Employee getEmployee(String employeeId){
		Employee employee = new Employee("e001", "Arvind", 100000, "d001");
		return employee;
	}

}
