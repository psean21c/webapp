package spring.autowire.q5.jsr250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Logger {

	private ConsoleWriter consoleWriter;
	
	@Resource
	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy");
	}
	
	public void writeConsole(String text) {
		if(consoleWriter != null){
			consoleWriter.write(text + consoleWriter.getName());
		} else {
			System.out.println("not write console because consoleWriter is null");
		}
	}

}
