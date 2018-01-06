package spring.jdbc.transaction;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CustomerDAO {
	
	@Transactional
//	private String getCustomer();
	public String getCustomer();
}
