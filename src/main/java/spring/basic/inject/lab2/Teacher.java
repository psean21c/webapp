package spring.basic.inject.lab2;

public class Teacher {

	private String name;

	public Teacher(){
	      System.out.println("Inside Teacher constructor." );
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
