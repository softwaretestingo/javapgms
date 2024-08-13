package com.softwaretestingo.sto014_CLASS;
import java.util.Scanner;
public class ScannerClassEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Scanner Class Example
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in );
		System.out.println("Taking inputs from user");
		System.out.println("Enter name of the Employee:");
		
		// String input 
		String name = sc.nextLine();
		System.out.println("Enter post:");
		String post = sc.nextLine();
		System.out.println("Enter gender:");
		
		// Character input 
		char gender = sc.next().charAt(0);
		
		// Numerical data input 
		System.out.println("Enter age:");
		int age = sc.nextInt();
		System.out.println("Enter mobile number:");
		long mobileNo = sc.nextLong();
		System.out.println("Enter salary");
		double salary = sc.nextDouble();
		
		// Print the values to check if the input was correctly obtained. 
		System.out.println("Name: " + name);
		System.out.println("Post: " + post);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("Salary: " + salary);
	}
}