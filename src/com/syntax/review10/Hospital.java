package com.syntax.review10;

public class Hospital {

	public static void main(String[] args) {
		Doctor d1=new Doctor("John","Family Doctor", 123456);
//		d1.name="Dr John";
//		d1.specialty="Family Doctor";
//		d1.licenceId=123456;

		d1.checkUp("Adam");
		d1.chargePatient();
		
		Doctor d2 = new Doctor("James", "Eye doctor", 234567, "123 Main St.", "Sunday");
		//d2.chargePatient();
		d2.displayInfo();
		
		System.out.println("-------Create Dermatologist---------");
		Dermatologist d3=new Dermatologist("Emily", "Dermatologist", 345678);
		d3.displayInfo();
		d3.checkUp("Anna");
		d3.chargePatient();
		d3.applySkinTreatment();
//		d2.applySkinTreatment(); //Not applicable for other doctors
		
		ENT d4=new ENT("Bulent", "ENT", 5768790);
		d4.displayInfo();
		d4.chargePatient();
		d4.checkUp("Mehmet");
		
		System.out.println("----------------Polimorphism---------------");
		Doctor d5;
		d5 = new Doctor();
		d5 = new ENT("Oz", "ENT", 678901);
		
		Dermatologist d6 = new Dermatologist("Wang", "Dermatologist", 789067);
		Doctor d7 = d6;
		
		//int[] ints = new int[5];
		Doctor[] doctors = new Doctor[5];
		doctors[0] = d1; 
		doctors[1] = d2;
		doctors[2] = d3;
		doctors[3] = d4;
		doctors[4] = d5;
		
		System.out.println("--------1st way----------");
		for( int i=0; i<doctors.length; i++) {
			Doctor d = doctors[i];
			d.displayInfo();
			d.chargePatient();
		}
		
		System.out.println("--------2nd way----------");
		for(Doctor doc : doctors) {
			doc.displayInfo();
		}
	}
	
	
}
