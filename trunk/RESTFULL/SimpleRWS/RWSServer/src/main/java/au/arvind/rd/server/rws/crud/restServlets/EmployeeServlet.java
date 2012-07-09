package au.arvind.rd.server.rws.crud.restServlets;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import au.arvind.rd.server.rws.crud.model.Employee;
import au.arvind.rd.server.rws.crud.service.EmployeeService;
import au.arvind.rd.server.rws.crud.service.EmployeeServiceImpl;

@Path("/employee")
public class EmployeeServlet {
	EmployeeService employeeService = new EmployeeServiceImpl();
	public EmployeeServlet(){
		super();
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public Employee getEmployee() {
		String employeeId = "";
		return employeeService.getEmployee(employeeId);
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void newEmployee(@FormParam("empId") String empId, @FormParam("name") String name, @FormParam("salary") String salary) {
		System.out.println(empId+":"+name+":"+salary);
	}

	/*@GET
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
	}*/
}
