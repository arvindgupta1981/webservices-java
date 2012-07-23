package au.arvind.rd.client.rws.crud;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import au.arvind.rd.server.rws.crud.model.Employee;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class EmployeeClient {
	public static void main(String[] args) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		// Fluent interfaces
		ClientResponse clientResponse=service.path("departments").path("departments").path("gets")
				.accept(MediaType.TEXT_XML).get(ClientResponse.class);
		System.out.println(clientResponse.getStatus());
		//System.out.println(clientResponse.getEntity(String.class));		
		System.out.println(clientResponse.getEntity(String.class));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8080/RWSServer").build();
	}
}
