package au.arvind.rd.client.rws.crud.controller;

import java.net.MalformedURLException;
import java.net.URI;

import javax.servlet.http.HttpServlet;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public abstract class BaseController extends HttpServlet {

	protected abstract URI getBaseURI();

	protected String resolveMethod(String action) {
		return action;
	}

	protected void processRequest(String requestMethod) {

	}

	protected ClientResponse getClientResponse(String mediaType, String method, String...paths) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(getBaseURI());
		for(String path:paths ){
			service = service.path(path);
		}
		try {
			System.out.println("client url:"+service.getURI().toURL().toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		if(method.equalsIgnoreCase("get")){
			return getWebresourceBuilder(mediaType, service).get(ClientResponse.class);
		}else if(method.equalsIgnoreCase("post")){
			return getWebresourceBuilder(mediaType, service).post(ClientResponse.class);
		} else if(method.equalsIgnoreCase("put")){
			return getWebresourceBuilder(mediaType, service).put(ClientResponse.class);
		}else {
			return getWebresourceBuilder(mediaType, service).delete(ClientResponse.class);
		}
		
	}

	private Builder getWebresourceBuilder(String mediaType, WebResource service) {
		return service.accept(mediaType);
	}

	protected boolean isResponseOK(ClientResponse response) {
		System.out.println("Response Status: "+response.getStatus());
		if(response.getStatus()==200){
			return true;
		}		
		return false;
	}
}
