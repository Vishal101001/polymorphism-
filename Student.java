package com.hello;
//
public class Student {

	public void printInfo(String name) {
		System.out.println("Name: "+name);
	}
	public void printInfo(int salary) {
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		Student s2 = new Student();
		s2.printInfo("Vishal");
		s2.printInfo(45000);
	}
}


