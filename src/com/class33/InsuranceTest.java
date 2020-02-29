package com.class33;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.class34.Card;

public class InsuranceTest {

	public static void main(String[] args) {
		List<Insurance> list=new LinkedList<>();
		Insurance ins=new Car("Geico", "Honda");
		Pet pet=new Pet("Fidelis", "Hasky");
			
		list.add(new Car("Geico", "Honda"));
		list.add(new Pet("Fidelis", "Shepherd dog"));
		list.add(new Health("BCBS"));
		list.add(ins);
		list.add(pet);
		
		Iterator<Insurance> insIterator=list.iterator();
		while(insIterator.hasNext()) {
			System.out.println("---------------------");
			
			Insurance in=insIterator.next();
			in.getQuote();
			in.cancelInsurance();
		}
	}
}


