package com.patterns.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IocApplicationTests {

	@Autowired
	@Qualifier("normal")
	Customer customerNormal;
	
	@Autowired
	@Qualifier("setter")
	Customer customerSetter;
	
	@Autowired
	@Qualifier("constructor")
	Customer customerConstructor;
	
	@Test
	public void testPaymentFieldLevelInjection() {
	    customerNormal.pay();
	}
	
	@Test
	public void testPaymentSetterInjection() {
	    customerSetter.pay();
	}
	
	@Test
	public void testCustomerConstructor() {
		customerConstructor.pay();
	}
}
