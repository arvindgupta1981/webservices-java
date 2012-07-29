package au.arvind.rd.server.rws.crud.service;

import java.beans.Introspector;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import au.arvind.rd.server.rws.crud.model.Department;
import au.arvind.rd.server.rws.crud.model.Employee;

public class DepartmentServiveImpl implements DepartmentService {
	List<Employee> employees = new ArrayList<Employee>();
	List<Department> departments = new ArrayList<Department>();

	public DepartmentServiveImpl() {
		employees.add(new Employee("Emp001", "Arvind", 100000, "Dept001"));
		employees.add(new Employee("Emp002", "Arv", 100000, "Dept001"));
		employees.add(new Employee("Emp003", "AG", 100000, "Dept001"));

		addDepartment(new Department(1l, "IT"));
		addDepartment(new Department(2l, "HR"));
		addDepartment(new Department(3l, "Admin"));
		addDepartment(new Department(4l, "Management"));
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
	public List<Department> modifyDepartment(Department department) {
		Department dept = findDepartment(department.getId());
		try {
			BeanUtils.copyProperties(dept, department);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		List<Department> depList = new ArrayList<Department>();
		depList.add(dept);
		return depList;
	}

	@Override
	public List<Department> getDepartment(Long id) {
		List<Department> depList = new ArrayList<Department>();
		depList.add(findDepartment(id));
		return depList;
	}

	private Department findDepartment(Long id) {
		for(Department department:departments){
			if(department.getId().equals(id)){
				return department;
			}
		}
		return null;

	}

	@Override
	public List<Department> getDepartments() {
		return departments;
	}
}
