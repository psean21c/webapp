//package spring.util;
package spring.basic.config.bean;

import org.springframework.beans.factory.FactoryBean;

import spring.basic.config.bean.ComplexBean;

public class ComplexBeanFactoryBeanImplementation implements FactoryBean<ComplexBean>{

	public ComplexBean getObject() throws Exception {
		ComplexBean bean = new ComplexBean();
		//Do Some Complex instantion here
		return bean;
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return ComplexBean.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
