package com.patterns.ioc.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.patterns.ioc.CreditCard;
import com.patterns.ioc.Customer;

@Component("setter")
public class CustomerImplSetter implements Customer {

	CreditCard creditCard;

	public CreditCard getCreditCard() {
		return creditCard;
	}

	@Autowired
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public void pay() {
		creditCard.makePayment();
	}

}
