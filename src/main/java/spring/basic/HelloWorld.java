package spring.basic;

public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		
		this.message = message;
	}
	/***
	public void getMessage() {
	 * 
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
	at aop.com.AopMain.main(AopMain.java:13)
	
	Need to change void > String
	 */

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}