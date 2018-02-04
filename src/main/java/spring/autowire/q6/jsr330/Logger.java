package spring.autowire.q6.jsr330;



import javax.inject.Inject;
import javax.inject.Named;

public class Logger {

	private ConsoleWriter consoleWriter;
	
	@Inject
	@Named(value="colorConsoleWriter")
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
