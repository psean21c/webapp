package spring.basic.beans.constructor;

public class Address {

	private String street;
	private String postal;
	

	public Address(String street, String postal) {
		super();
		this.street = street;
		this.postal = postal;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public void initDo(){
		System.out.println("initDo:" + this);
	}
	
	public void destroyDo(){
		System.out.println("destroyDo:" + this);
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", postal=" + postal + "]";
	}
}
