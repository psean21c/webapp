package spring.basic.beans.component.scan.auto;

import org.springframework.stereotype.Repository;

//@Component
@Repository
public class CustomerDAO {
	@Override
	public String toString() {
		return "Hello , This is CustomerDAO";
	}
}
