package com.class32;

public class Person {

	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;

	Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
	}

	public void formatBirthday() {
		System.out.println(birthmonth+"/"+birthday+"/"+birthyear);
	}
	
//getting
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public int getBirthMonth() {
		return birthmonth;
	}
	public int getBirthDay() {
		return birthday;
	}
	public int getBirthYear() {
		return birthyear;	
	}
	public String getSSN() {
		return ssn;
	}
//setting	
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	public void setBirthMonth(int birthmonth) {
		this.birthmonth=birthmonth;
	}
	public void setBirthDay(int birthday) {
		this.birthday=birthday;
	}
	public void setBirthYear(int birthyear) {
		this.birthyear=birthyear;
	}
	public void setSSN(String ssn) {
		this.ssn=ssn;
	}
}
