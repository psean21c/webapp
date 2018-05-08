package spring.abc.bean.getbean.q1;

public class AirService {
	public String name;
	
	public AirService(){}
	
	public AirService(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
