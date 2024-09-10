package com.DP;

public class CreditCardFactory implements PaymentFactory {

	@Override
	public PaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
		return new CreditCard();
	}

}
