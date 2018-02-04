package spring.autowire.q2;

public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Write to file: " + text);
	}

}
