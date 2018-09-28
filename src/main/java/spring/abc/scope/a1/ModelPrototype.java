package spring.abc.scope.a1;

public class ModelPrototype {

	String preferName;
	private int count = 0;

	public ModelPrototype(){
		count++;
		System.out.println("ModelPrototype-0:" + count);
	}
	
	public ModelPrototype(String preferName) {
		count++;
		this.preferName = preferName;
		System.out.println("ModelPrototype-1:" + count);
	}

	public String getPreferName() {
		return preferName;
	}

	public void setPreferName(String preferName) {
		this.preferName = preferName;
	}

	public int getCount(){
		return count;
	}
}
