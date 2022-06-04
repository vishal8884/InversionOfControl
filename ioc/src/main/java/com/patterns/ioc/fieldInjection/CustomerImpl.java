package com.patterns.ioc.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.patterns.ioc.CreditCard;
import com.patterns.ioc.Customer;

@Component("normal")
public class CustomerImpl implements Customer {

	@Autowired
	CreditCard creditCard;
	
	@Override
	public void pay() {
        creditCard.makePayment();
	}

}
