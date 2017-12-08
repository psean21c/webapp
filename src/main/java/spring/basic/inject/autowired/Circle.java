package spring.basic.inject.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	
	private Point center;
	
	public void draw() {
		System.out.println("Circle: Point is (" + center.getX() + ", " + center.getY() + ")");
	}
	
	public Point getCenter(){
		return center;
	}
	
	@Autowired
	@Qualifier("circleRelated")
	@Required
	public void setCenter(Point center){
		this.center = center;
	}

}