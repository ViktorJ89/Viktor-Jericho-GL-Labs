package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class Driver {

	public static void main(String[] args) {
		Employee employee = new Employee("Tony", "Stark");

		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		System.out.println(" Enter the Department ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		} else if (option == 2) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "admin");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		} else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		} else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		} else
			System.out.println(" Enter Correct Option");
	}

}
