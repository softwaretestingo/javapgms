package com.softwaretestingo.javapgms;
public class EmailValidatorTest 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Email Validation Test
	 * 
	 */
	// list of valid email addresses
	private static final String[] validEmailIds = new String[] { "softwaretestingo@yahoo.com", "softwaretestingo-100@yahoo.com",
			"softwaretestingo.100@yahoo.com", "softwaretestingo111@softwaretestingo.com", "softwaretestingo-100@softwaretestingo.net",
			"softwaretestingo.100@softwaretestingo.com.au", "softwaretestingo@1.com", "softwaretestingo@gmail.com.com",
			"softwaretestingo+100@gmail.com", "softwaretestingo-100@yahoo-test.com", "softwaretestingo_100@yahoo-test.ABC.CoM" };

	// list of invalid email addresses
	private static final String[] invalidEmailIds = new String[] { "softwaretestingo", "softwaretestingo@.com.my",
			"softwaretestingo123@gmail.a", "softwaretestingo123@.com", "softwaretestingo123@.com.com", ".softwaretestingo@softwaretestingo.com",
			"softwaretestingo()*@gmail.com", "softwaretestingo@%*.com", "softwaretestingo..2002@gmail.com", "softwaretestingo.@gmail.com",
			"softwaretestingo@softwaretestingo@gmail.com", "softwaretestingo@gmail.com.1a" };

	private static EmailValidator emailValidator;

	public static void main(String args[]) {
		emailValidator = new EmailValidator();
		for (String temp : validEmailIds) {
			boolean valid = emailValidator.validateEmail(temp);
			System.out.println("Email ID " + temp + " is valid? " + valid);
		}
		System.out.println("\n\n");
		for (String temp : invalidEmailIds) {
			boolean valid = emailValidator.validateEmail(temp);
			System.out.println("Email ID " + temp + " is valid? " + valid);
		}
	}
}