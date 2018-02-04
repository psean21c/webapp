package spring.autowire.q4.qualifier;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println( "Write to console: " + text);
	}

}
