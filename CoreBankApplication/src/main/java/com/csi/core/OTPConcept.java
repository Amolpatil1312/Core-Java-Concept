package com.csi.core;

public class OTPConcept {

	public static void main(String[] args) {
		int otp = (int) (Math.random() * 9000 + 1000);
		System.out.println(otp);
	}

}
