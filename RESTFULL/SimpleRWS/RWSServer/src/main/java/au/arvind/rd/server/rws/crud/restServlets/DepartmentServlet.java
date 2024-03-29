package au.arvind.rd.server.rws.crud.restServlets;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import au.arvind.rd.server.rws.crud.model.Department;
import au.arvind.rd.server.rws.crud.model.Employee;
import au.arvind.rd.server.rws.crud.service.DepartmentService;
import au.arvind.rd.server.rws.crud.service.DepartmentServiveImpl;

@Path("/departments")
public class DepartmentServlet {

	DepartmentService departmentService = new DepartmentServiveImpl();

	public DepartmentServlet() {
		super();
		
	}

	@POST
	@Path("/add")
	//@Consumes(MediaType.TEXT_XML)
	@Produces(MediaType.TEXT_XML)
	public Department addDepartment(Department department) {
		System.out.println("server add:  " +department.getName());
		return new Department(departmentService.addDepartment(department), department.getName());
	}

	@DELETE
	@Path("/delete/{depId}")
	public void deleteDepartment(@PathParam("depId") String depId) {
		System.out.println("server delete");
		departmentService.deleteDepartment(getDepartment(depId).get(0));
	}

	@PUT
	@Path("/update")
	@Consumes(MediaType.TEXT_XML)
	@Produces(MediaType.TEXT_XML)
	public List<Department> modifyDepartment(Department department) {
		System.out.println("server update");
		return departmentService.modifyDepartment(department);
	}

	@GET
	@Path("/get/{depId}")
	@Produces(MediaType.TEXT_XML)
	public List<Department> getDepartment(@PathParam("depId") String depId) {
		System.out.println("server get"+depId);
		if(depId==null || depId.length()==0){
			return departmentService.getDepartments();
		}
		return departmentService.getDepartment(Long.parseLong(depId));
	}
	
	@GET
	@Path("/gets")
	@Produces(MediaType.TEXT_XML)
	public List<Department> getDepartments() {
		System.out.println("server gets");
		return departmentService.getDepartments();
	}

	@GET
	@Path("/getEmployees")
	@Produces(MediaType.TEXT_XML)
	public List<Employee> getEmployees() {
		System.out.println("server get emp");
		return departmentService.getEmployees();
	}

}
