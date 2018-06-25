package spring.abc.bean.q3;

public class MyServiceImpl {

	private int id;
	private String name;

	public MyServiceImpl() {
		setId(1);
		setName("myService");
	}

	public MyServiceImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
