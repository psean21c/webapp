package spring.abc.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomerService implements InitializingBean, DisposableBean
{
	String message;
	
	public String getMessage() {
	  System.out.println("********getMessage()**********: ");
	  return message;
	}

	public void setMessage(String message) {
	  System.out.println("********setMessage()**********: ");
	  this.message = message;
	}
	
	public void afterPropertiesSet() throws Exception {
	  System.out.println("********afterPropertiesSet()**********Init method after properties are set : " + message);
	}
	
	public void destroy() throws Exception {
	  System.out.println("********destroy()**********Spring Container is destroy! Customer clean up");
	}
	
}