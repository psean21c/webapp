package spring.abc.bean.q2;

public class Foo {
	public String name;
	
	public Bar bar;
	
	public Foo(){}
	
	public Foo(Bar bar){
		this.bar = bar;
	}
	
	public Foo(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
