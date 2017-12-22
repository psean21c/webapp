package spring.basic;

import org.springframework.core.SpringVersion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.basic.inject.lab2.Lecture;

public class MainApp {

	public static void main(String[] args) {

		runSpringVersion();
		runAutoWired();
	}

	static void runSpringVersion() {
		// org.springframework.core.SpringVersion.getVersion()
		System.out.println(SpringVersion.getVersion());

	}

	@SuppressWarnings("resource")
	static void runAutoWired() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// // 1) hello
		 HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		 obj.getMessage();
		//
		// // 2) Inject
		// TextEditor te = (TextEditor) context.getBean("textEditor");
		// te.spellCheck();
		//
		// // 3) Required
		// Student student = (Student) context.getBean("pupil");
		// System.out.println("Name : " + student.getName());
		// System.out.println("Age : " + student.getAge());

		// 4) Autowired
		Lecture lecture = (Lecture) context.getBean("lecture");
		lecture.doMark();

		// String ctxID = context.getId();
		// System.out.println(ctxID + "");

	}
}