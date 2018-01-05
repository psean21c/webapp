package spring.basic.beans.component.scan;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {

	CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}

	
}
