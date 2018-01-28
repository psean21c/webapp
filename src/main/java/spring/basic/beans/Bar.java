package spring.basic.beans;

public class Bar {

	public String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void writeBarName(){
		
		System.out.println("name:" + getName());
	}
	
}
