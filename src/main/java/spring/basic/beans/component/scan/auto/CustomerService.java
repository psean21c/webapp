package spring.basic.beans.component.scan.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

	@Autowired
	CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}

	
}
