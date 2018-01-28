package spring.basic.log4j;

import org.apache.log4j.Logger;

import org.springframework.core.env.StandardEnvironment;

public class Bar {

	public String name;

	private static Logger logger = Logger.getLogger(Bar.class);

	
	public Bar(){
		StandardEnvironment env = new StandardEnvironment();
		env.addActiveProfile("./spring/basic/log4j/lo4j.properties");

	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void writeBarName(){
		
		System.out.println("name:" + getName());
		logger.info("called writeBarName");
	}
	
}
