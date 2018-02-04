package spring.autowire.q3;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println( "Write to console: " + text);
	}

}
