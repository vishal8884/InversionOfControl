package com.patterns.ioc.constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.patterns.ioc.CreditCard;
import com.patterns.ioc.Customer;

@Component("constructor")
public class CustomerImplConstructor implements Customer {

	private CreditCard creditCard;
	
	@Autowired
	public CustomerImplConstructor(CreditCard creditCard) {
		this.creditCard=creditCard;
	}


	@Override
	public void pay() {
		creditCard.makePayment();
	}

}
