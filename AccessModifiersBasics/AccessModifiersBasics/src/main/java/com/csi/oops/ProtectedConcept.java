package com.csi.oops;

import com.csi.core.AccessModifierCoreConcept;

public class ProtectedConcept extends AccessModifierCoreConcept {

	public static void main(String[] args) {

		ProtectedConcept concept = new ProtectedConcept();

		System.out.println("\n Company CIN: " + concept.companyId);
		System.out.println("\n Company Name: " + concept.companyName);

		concept.display();
	}

}
