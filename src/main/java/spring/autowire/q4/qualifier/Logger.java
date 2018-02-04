package spring.autowire.q4.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {

	private ConsoleWriter consoleWriter;
	
	@Autowired
	@Qualifier("consoleWriter2")
	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}
	
	
	public void writeConsole(String text) {
		if(consoleWriter != null){
			consoleWriter.write(text + consoleWriter.getName());
		} else {
			System.out.println("not write console because consoleWriter is null");
		}
	}

}
