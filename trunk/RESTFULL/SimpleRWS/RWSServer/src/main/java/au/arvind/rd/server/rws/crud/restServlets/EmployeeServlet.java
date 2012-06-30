package au.arvind.rd.server.rws.crud.restServlets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import au.arvind.rd.server.rws.crud.service.EmployeeServiceImpl;

@Path("/employee")
public class EmployeeServlet {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDepartmentId(String empId) {
		return new EmployeeServiceImpl().getDepartmentId(empId);
	}
}
