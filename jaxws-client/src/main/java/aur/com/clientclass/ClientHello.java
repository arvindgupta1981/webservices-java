package aur.com.clientclass;

import au.com.hello.HelloWsService;

public class ClientHello {
	public static void main(String[] args) {
		
		System.out.println(new HelloWsService().getWSDLDocumentLocation());
		System.out.println(new HelloWsService().getHelloWsPort().sayHello("1"));
		

	}

}
