package spring.basic.inject.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Lecture {

//	@Autowired
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Lecture(){
	}
	
	public void doMark(){
		System.out.println("Tutor:" + teacher.getName());
		
	}
	
}
