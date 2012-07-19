package au.arvind.rd.server.rws.crud.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Department {
	Long id;
	String name;

	public Department() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
