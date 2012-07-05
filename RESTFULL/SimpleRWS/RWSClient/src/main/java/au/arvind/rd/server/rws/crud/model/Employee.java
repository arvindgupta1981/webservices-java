package au.arvind.rd.server.rws.crud.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private String empId;
	private String name;
	private long salary;
	private String deptId;
	
	public Employee(){}
	
	public Employee(String empId, String name, long salary, String deptId) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.deptId=deptId; 
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return empId+":"+name+":"+salary+":"+deptId;
	}
	
}
