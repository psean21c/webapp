package spring.basic.inject.autowired3;

public class Foo {

	public String firstname;
	
	public Foo(){
		
	}
	
	public void write(){
		System.out.println("Foo is writing: " + getFirstname());
	}
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

}
