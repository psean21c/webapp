package spring.abc.scope.a1;

public class ModelSingleton {


	String name;
	private int count = 0;

	/***
	 * Constructor
	 */
	public ModelSingleton() {
		count++;
		System.out.println("ModelSingleton-0:" + count);
	}
	
	public ModelSingleton(String name) {
		count++;
		this.name = name;
		System.out.println("ModelSingleton-1:" + count);
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCount(){
		return count;
	}
	
	
}
