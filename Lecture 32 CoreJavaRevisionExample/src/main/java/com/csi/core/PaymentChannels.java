package com.csi.core;

import java.io.Serializable;

class CashPayment {
	void show() {
		System.out.println("Cash Payment");
	}
}
class UPIPayment extends CashPayment {
	void show() {
		System.out.println("UPI Payment");
	}
}
class ChequePayment extends UPIPayment {
	void show() {
		super.show();
		System.out.println("Cheque Payment");
	}
	
	
}
public class PaymentChannels {
	public static void main(String[] args) {

		/*
		 * UPIPayment payment = (UPIPayment) new CashPayment();
		 * 
		 * payment.get(); payment.set();
		 */
		ChequePayment chequePayment = new ChequePayment();
		chequePayment.show();

	}
}
