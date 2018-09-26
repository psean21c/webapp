package spring.sandbox;

public class Foo {
	public String name;
	
//	public AppConfig bar;
	
	public Foo(){}
	
	public Foo(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public AppConfig getBar() {
//		return bar;
//	}
//
//	public void setBar(AppConfig bar) {
//		this.bar = bar;
//	}
}
