package com.fullstack.core;

interface Profession {
	public void print();
}

class Doctor implements Profession {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("I am Doctor");
	}
}

class Engineer implements Profession {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("I am Engineer");
	}
}

class ProfessionFactory {

	public Profession getProfession(String profession) {
		if (profession.equals("Doctor")) {
			return new Doctor();
		} else if (profession.equals("Engineer")) {
			return new Engineer();
		} else {
			return null;
		}
	}

}

public class FactoryPatternEx {

	public static void main(String[] args) {

		ProfessionFactory factory = new ProfessionFactory();

		Profession profession = factory.getProfession("Engineer");
		profession.print();
	}

}
