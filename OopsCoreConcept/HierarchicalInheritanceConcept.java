package com.csi.coreoops;

class Bank {
	int rateOfInterest() {
		return 0;
	}
}

class SBIBank extends Bank {
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
}

class ICICBank extends Bank {
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 9;
	}
}

class HDFCBank extends Bank {
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
}

public class HierarchicalInheritanceConcept {
	public static void main(String[] args) {

		SBIBank sbiBank = new SBIBank();
		ICICBank icicBank = new ICICBank();
		HDFCBank hdfcBank = new HDFCBank();

		System.out.println("\n SBI Bank: " + sbiBank.rateOfInterest() + "\n ICIC Bank: " + icicBank.rateOfInterest()
				+ "\n HDFC Bank: " + hdfcBank.rateOfInterest());

	}
}
