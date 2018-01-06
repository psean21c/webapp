package spring.jdbc.transaction;

import org.springframework.stereotype.Component;

@Component
public class CustomerDAOImpl implements CustomerDAO {

	public String getCustomer() {
		return "Hello Customer";
	}

}
