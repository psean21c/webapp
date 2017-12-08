package spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.basic.inject.TextEditor;
import spring.basic.inject.autowired.Lecture;
import spring.basic.inject.required.Student;

public class MainApp {

	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		// 1) hello
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//		obj.getMessage();
//
//		// 2) Inject
//		TextEditor te = (TextEditor) context.getBean("textEditor");
//		te.spellCheck();
//
//		// 3) Required
//		Student student = (Student) context.getBean("pupil");
//		System.out.println("Name : " + student.getName());
//		System.out.println("Age : " + student.getAge());

		// 4) Autowired
		Lecture lecture = (Lecture) context.getBean("lecture");
		lecture.doMark();
		
//		String ctxID = context.getId();
//		System.out.println(ctxID + "");

	}
}