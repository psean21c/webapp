package spring.basic.beans.component.scan.auto;

import org.springframework.stereotype.Controller;

//@Component
//@Repository
@Controller
public class CustomerDAO {
	@Override
	public String toString() {
		return "Hello , This is CustomerDAO";
	}
}
