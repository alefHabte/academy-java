package com.bptn.course._02_week_2_Big_Coding;

public class Employee {
	private int salary;
	private int hoursPerDay;
	
	public Employee(int salary, int hoursPerDay) {
		setSalary(salary);
		setHoursPerDay(hoursPerDay);

	}

	public void setHoursPerDay(int hoursPerDay) {

		if(hoursPerDay>6) {
			this.salary += 5;
		}
		this.hoursPerDay = hoursPerDay;
	}

	public void setSalary(int salary) {

		if (salary < 500) {
			this.salary = salary + 10;
		} else {
			this.salary = salary;

		}
	}
	
	

	public int getSalary() {
		return this.salary;
		
	}

	public int getHoursPerDay() {
		return this.hoursPerDay;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Employee student = new Employee(100, 8);
			System.out.println(student.getSalary());

	}

}
