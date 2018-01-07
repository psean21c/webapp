package spring.basic.beans.constructor;

public class Person {

	private int id;
	private String name;
	
	private int sinID;
	private Address address;
	
	public Person(){}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void initDo(){
		System.out.println("initDo:" + this);
	}
	
	public void destroyDo(){
		System.out.println("destroyDo:" + this);
	}
	public void onCreate(){
		System.out.println("onCreate:" + this);
	}
	
	public void onDestroy(){
		System.out.println("onDestroy:" + this);
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setSinID(int sinID) {
		this.sinID = sinID;
	}

	public void talk(){
		System.out.println("Hello I want to talk");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sinID=" + sinID + ", address=" + address + "]";
	}


}
