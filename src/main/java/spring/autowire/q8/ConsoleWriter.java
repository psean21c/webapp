package spring.autowire.q8;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	private String name;
	
	public void write(String text) {
		System.out.println( "Write to console: " + text);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
