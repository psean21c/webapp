package spring.sandbox;

import org.springframework.stereotype.Component;

@Component
public class Bar {

	public String name;

	public Foo foo;
	
	public Bar(){}
	
	public Foo getFoo() {
		return foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
