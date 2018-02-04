package spring.autowire.q8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Logger {

	private ConsoleWriter consoleWriter;
//	private int id = 0;
	
	@Autowired
	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}
	
//	public void setId(int id){
//		this.id = id;
//	}

	public void writeConsole(String text) {
		if(consoleWriter != null){
			consoleWriter.write(consoleWriter.getName() + text);
		} else {
			System.out.println("not write console because consoleWriter is null");
		}
	}

}
