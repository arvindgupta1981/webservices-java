package au.arvind.rd.server.rws.crud.restServlets;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import au.arvind.rd.server.rws.crud.service.EmployeeServiceImpl;

@Path("/employee")
public class EmployeeServlet {
	
	public EmployeeServlet(){
		super();
		System.out.println("+++++++++++++++++++++Constractor");
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getDepartmentId(String empId) {
		System.out.println("text plain");
		return new EmployeeServiceImpl().getDepartmentId(empId);
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getIdDepartment(String empId) {
		System.out.println("txt html");
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
				+ "<body><h1>" + new EmployeeServiceImpl().getDepartmentId(empId) + "</body></h1>" + "</html> ";
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String getDepartmentIdPost(String empId) {
		System.out.println("text plain post");
		return new EmployeeServiceImpl().getDepartmentId(empId);
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	public String getIdDepartmentPost(String empId) {
		System.out.println("txt html post");
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
		+ "<body><h1>" + new EmployeeServiceImpl().getDepartmentId(empId) + "</body></h1>" + "</html> ";
	}
}
