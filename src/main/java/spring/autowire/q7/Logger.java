package spring.autowire.q7;

import org.springframework.beans.factory.annotation.Autowired;


public class Logger {

	private ConsoleWriter consoleWriter;
	
	@Autowired
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
