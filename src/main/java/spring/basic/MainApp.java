package spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.basic.inject.TextEditor;

public class MainApp {
	
	//@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// 1) hello
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

		// 2) Inject
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();

		String ctxID = context.getId();
		System.out.println(ctxID + "");

	}
}