package jaxwsExample.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class HelloWs {

  public List<String> sayHello(String name) {
	  List<String> al=new ArrayList<String>();
	  al.add("Ram Singh");
	  al.add("Amit Puri");
	  return al;
  }
    /*if (name == null) {
      return "Hello";
    }

    return "Hello, " + name + "!";
  }*/
}