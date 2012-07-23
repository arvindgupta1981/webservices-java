package au.arvind.rd.server.rws.crud.restServlets;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import au.arvind.rd.server.rws.crud.model.Department;
import au.arvind.rd.server.rws.crud.model.Employee;
import au.arvind.rd.server.rws.crud.service.DepartmentService;
import au.arvind.rd.server.rws.crud.service.DepartmentServiveImpl;

@Path("/departments")
public class DepartmentServlet {
	
	DepartmentService departmentService=new DepartmentServiveImpl();
	
	public DepartmentServlet(){
		super();
		departmentService.addDepartment(new Department(1L, "IT"));
		departmentService.addDepartment(new Department(2L, "IT"));
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.TEXT_XML)
	@Produces(MediaType.TEXT_PLAIN)
	public Long addDepartment(Department department) {
		System.out.println("server add");
		return departmentService.addDepartment(department);
	}
	
	@DELETE
	@Path("/delete")
	@Consumes(MediaType.TEXT_XML)
	public void deleteDepartment(Department department) {
		System.out.println("server delete");
		departmentService.deleteDepartment(department);
	}

	@PUT
	@Path("/update")
	@Consumes(MediaType.TEXT_XML)
	@Produces(MediaType.TEXT_XML)
	public Department modifyDepartment(Department department) {
		System.out.println("server update");
		return departmentService.modifyDepartment(department);
	}

	@GET
	@Path("/get")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_XML)
	public Department getDepartment(Long id) {
		System.out.println("server get");
		return departmentService.getDepartment(id);
	}

	@GET
	@Path("/gets")
	@Produces(MediaType.TEXT_XML)
	public Collection<Department> getDepartments() {
		System.out.println("server gets");
		return departmentService.getDepartments();
	}

	@GET
	@Path("/getEmployees")
	@Produces(MediaType.TEXT_XML)
	public Collection<Employee> getEmployees() {
		System.out.println("server get emp");
		return departmentService.getEmployees();
	}

}
