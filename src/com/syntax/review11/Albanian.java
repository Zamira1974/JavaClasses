package com.syntax.review11;


public class Albanian extends Human{
	String albanianId;
	
	public Albanian(String name, int age, int weight, String albanianId) {
		super(name, age, weight);
		this.albanianId=albanianId;
	}
	
	public Albanian() {
		
	}

	private void haveAlbanianId() {
	System.out.println("Albanian have own zip code");

	}

	@Override
	public String greeting() {
		return "Pershendetje";
	}

	@Override
	public void talk() {
		System.out.println("Une flas shqip. Une quhet "+name);
	}
	
	public void albanianDance() {
		System.out.println("Dancing like an albanian");
	}
}
