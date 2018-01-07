package spring.basic.beans.constructor;

public class Person {

	private int id;
	private String name;
	
	public Person(){}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void talk(){
		System.out.println("Hello I want to talk");
	}
}
