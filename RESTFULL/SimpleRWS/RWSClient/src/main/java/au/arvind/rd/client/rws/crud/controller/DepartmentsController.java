package au.arvind.rd.client.rws.crud.controller;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import au.arvind.rd.server.rws.crud.model.Department;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;

public class DepartmentsController extends BaseController {

	private static final long serialVersionUID = 184949847748478L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Get" + req.getMethod());
		if (req.getParameter("action").equals("gets")) {
			System.out.println("client gets");
			String[] paths = {"departments","departments","gets"};
			ClientResponse response = getClientResponse(MediaType.TEXT_XML,"GET",paths);
			
			System.out.println(isResponseOK(response));
			if(isResponseOK(response)){
				Department[] departments = response.getEntity(Department[].class);
				for(Department department:departments){
					System.out.println(department.toString());
				}
			}
		 		
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Post" + req.getMethod());
		if (req.getParameter("action").equals("add")) {
			String[] paths = {"departments","departments","add"};
			ClientResponse response = getClientResponse(MediaType.TEXT_PLAIN,"POST",paths);
			System.out.println(isResponseOK(response));
			if(isResponseOK(response)){
				System.out.println(response.getEntity(String.class));
			}
		} 
	}

	@Override
	protected URI getBaseURI() {
		return UriBuilder
				.fromUri("http://localhost:8080/RWSServer").build();
	}

}
