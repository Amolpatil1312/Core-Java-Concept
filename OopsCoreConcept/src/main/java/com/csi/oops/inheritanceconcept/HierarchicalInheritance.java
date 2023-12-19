package com.csi.oops.inheritanceconcept;

class Bank {
	double rateOfInterst() {
		return 0.0;
	}
}

class HDFCBank extends Bank {
	@Override
	double rateOfInterst() {
		// TODO Auto-generated method stub
		return 13.5;
	}
}

class ICICIBank extends Bank {
	@Override
	double rateOfInterst() {
		// TODO Auto-generated method stub
		return 12.0;
	}
}

class AXISBank extends Bank {
	@Override
	double rateOfInterst() {
		// TODO Auto-generated method stub
		return 12.5;
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {

		Bank hdfcBank = new HDFCBank();
		System.out.println("\n HDFC Bank: " + hdfcBank.rateOfInterst());

		Bank iciciBank = new ICICIBank();

		System.out.println("\n ICICI Bank: " + iciciBank.rateOfInterst());

		Bank axixBank = new AXISBank();

		System.out.println("\n Axis Bank: " + axixBank.rateOfInterst());
	}
}
