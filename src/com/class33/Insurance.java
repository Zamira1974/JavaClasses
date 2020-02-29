package com.class33;

/*Create a class Insurance that will have an attribute as insuranceName
 and unimplemented behavior
as getQuote and cancelInsurance.Create 3 subclasses Car, Pet, Health.
Car class has it’s own attribute as carModel and Class Pet has petType
attribute. Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/iterator access all methods of the class. */

public abstract class Insurance {
	String insuranceName;

	Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public abstract void getQuote();

	public abstract void cancelInsurance();
}

class Car extends Insurance {

	private String carModel;

	Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}
	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel insurance " + insuranceName + " for car " + carModel);
	}
	@Override
	public void getQuote() {
		System.out.println("Get quote insurance " + insuranceName + " for car " + carModel);
	}
}

class Pet extends Insurance {
	
	private String petType;

	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}
	@Override
	public void getQuote() {
		System.out.println("Get quote from " + insuranceName + " for pet " + petType);
	}
	@Override
	public void cancelInsurance() {
		System.out.println("Cancel insurance " + insuranceName + " for pet " + petType);
	}
}

class Health extends Insurance {

	Health(String insuranceName) {
		super(insuranceName);
	}
	@Override
	public void getQuote() {
		System.out.println("Get quote about insurance " + insuranceName);
	}
	@Override
	public void cancelInsurance() {
		System.out.println("You can cancel " + insuranceName + " any time.");
	}

}