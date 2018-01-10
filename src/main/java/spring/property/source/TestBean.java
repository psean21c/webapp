package spring.property.source;

public class TestBean {
	
	public TestBean() {
	}

	public TestBean(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
