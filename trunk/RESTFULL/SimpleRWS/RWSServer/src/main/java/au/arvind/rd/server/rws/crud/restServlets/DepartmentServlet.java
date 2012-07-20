package au.arvind.rd.server.rws.crud.restServlets;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
	
	@POST
	@Path("/add")
	@Consumes(MediaType.TEXT_XML)
	@Produces(MediaType.TEXT_PLAIN)
	Long addDepartment(Department department) {
		return departmentService.addDepartment(department);
	}
	
	@DELETE
	@Path("/delete")
	@Consumes(MediaType.TEXT_XML)
	void deleteDepartment(Department department) {
		departmentService.deleteDepartment(department);
	}

	@PUT
	@Path("/update")
	@Consumes(MediaType.TEXT_XML)
	@Produces(MediaType.TEXT_XML)
	Department modifyDepartment(Department department) {
		return departmentService.modifyDepartment(department);
	}

	@POST
	@Path("/get")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_XML)
	Department getDepartment(Long id) {
		return departmentService.getDepartment(id);
	}

	@POST
	@Path("/gets")
	@Produces(MediaType.TEXT_XML)
	Collection<Department> getDepartments() {
		return departmentService.getDepartments();
	}

	@POST
	@Path("/getEmployees")
	@Produces(MediaType.TEXT_XML)
	Collection<Employee> getEmployees() {
		return departmentService.getEmployees();
	}

}
