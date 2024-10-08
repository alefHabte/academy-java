package com.bptn.course._02_week_2_Big_Coding;

public class Person {
	private String firstName;
	private String lastname;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private String ssn;

	public Person(String firstName, String lastname, int birthMonth, int birthDay, int birthYear, String ssn) {
		this.firstName=firstName;
		this.lastname=lastname;
		this.birthMonth=birthMonth;
		this.birthDay = birthDay;
		this.birthYear=birthYear;
		this.ssn=ssn;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthday() {
		return this.birthMonth + "/" + this.birthDay + "/" + this.birthYear;
	}

	public void setBirthday(int birthDay) {
		this.birthDay = birthDay;
	}

	public boolean verifySSN(String ssn) {
		return this.ssn.equals(ssn);
		
	}


	public static void main(String[] args) {
		Person person1 = new Person("John", "Doe", 1, 1, 1990, "123-45-6789");
		Person person2 = new Person("Jane", "Doe", 2, 2, 1991, "987-65-4321");
		Person person3 = new Person("Jane", "Smith", 1, 1, 1990, "111-11-1111");
		Person person4 = new Person("Jane", "Smith", 2, 2, 1991, "222-22-2222");

		System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getFirstName() + " Birthday: "
				+ person1.getBirthday() + " SSN: " + person1.verifySSN("123-45-6789"));
		System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getFirstName() + " Birthday: "
				+ person2.getBirthday() + " SSN: " + person2.verifySSN("987-65-4321"));
		System.out.println("Person 3: " + person3.getFirstName() + " " + person3.getFirstName() + " Birthday: "
				+ person3.getBirthday() + " SSN: " + person3.verifySSN("111-11-1111"));
		System.out.println("Person 4: " + person4.getFirstName() + " " + person4.getFirstName() + " Birthday: "
				+ person4.getBirthday() + " SSN: " + person4.verifySSN("222-22-2222"));
	}

}
