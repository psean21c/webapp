package spring.basic.inject.autowired2;

public class Foo {

	public Foo(Bar bar){
		System.out.println("Foo created");
	}
	
	public void write(){
		System.out.println("Foo is writing");
	}
}
