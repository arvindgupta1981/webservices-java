package au.arvind.rd.client.rws.crud.controller;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import au.arvind.rd.server.rws.crud.model.Department;

import com.sun.jersey.api.client.ClientResponse;

public class DepartmentsController extends BaseController {

	private static final long serialVersionUID = 184949847748478L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Get" + req.getMethod());
		if (req.getParameter("action").equals("gets")) {
			System.out.println("client gets");
			String[] paths = {"departments","departments","gets"};
			ClientResponse response = getClientResponse(null, MediaType.TEXT_XML,"GET",paths);			
			postProcessGet(req, resp, response);		 		
			
		} else if (req.getParameter("action").equals("get") || req.getParameter("action").equals("previous") || req.getParameter("action").equals("next")) {
			System.out.println("client get");
			String[] paths = {"departments","departments",req.getParameter("action").toString(),req.getParameter("depId").toString()};
			ClientResponse response = getClientResponse(null, MediaType.TEXT_XML,"GET",paths);
			postProcessGet(req, resp, response);		 		
		}  
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Post" + req.getMethod());
		if (req.getParameter("action").equals("add")) {
			System.out.println("client add");
			String[] paths = {"departments","departments","add"};
			ClientResponse response = getClientResponse(buildDepartment(req),MediaType.TEXT_XML,"POST",paths);
			
			postProcessPost(resp, response);		 		
		} else if (req.getParameter("action").equals("update")) {
			System.out.println("client gets");
			String[] paths = {"departments","departments","update"};
			ClientResponse response = getClientResponse(buildDepartment(req),MediaType.TEXT_XML,"PUT",paths);
			
			postProcessPost(resp, response);		 		
		} else if (req.getParameter("action").equals("delete")) {
			System.out.println("client gets");
			String[] paths = {"departments","departments","delete"};
			ClientResponse response = getClientResponse(buildDepartment(req),MediaType.TEXT_XML,"DELETE",paths);
			
			postProcessPost(resp, response);		 		
		}
	}

	private void postProcessPost(HttpServletResponse resp,
			ClientResponse response) throws IOException {
		System.out.println(isResponseOK(response));
		if(isResponseOK(response)) {
			System.out.println("Client resp. id:"+response.getEntity(String.class));
			resp.sendRedirect("departments?action=gets");
		}
	}
	
	private void postProcessGet(HttpServletRequest req, HttpServletResponse resp,
			ClientResponse response) throws ServletException, IOException {
		System.out.println(isResponseOK(response));
		if(isResponseOK(response)) {
			Department[] departments = response.getEntity(Department[].class);
			List<Department> deptList = new ArrayList<Department>();
			req.setAttribute("departments", deptList);
			for(Department department:departments){
				System.out.println(department.toString());
				deptList.add(department);
			}
			req.getRequestDispatcher("Departments.jsp").forward(req, resp);
		}
	}

	private Department buildDepartment(HttpServletRequest req){
		Department department = new Department(Long.parseLong(req.getParameter("depId")), req.getParameter("name").toString());
		return department;
	}

	@Override
	protected URI getBaseURI() {
		return UriBuilder
				.fromUri("http://localhost:8080/RWSServer").build();
	}

}
