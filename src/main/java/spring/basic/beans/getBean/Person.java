package spring.basic.beans.getBean;

public class Person {

	private int id;
	private String name;
	
	
	public Person(){}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static Person getInstance(int id, String name){
		System.out.println("Sam created by factory method **");
//		return new Person(12,"Sam");
		return new Person(id,name);
	}
	

	public void talk(){
		System.out.println("Hello I want to talk");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}


}
