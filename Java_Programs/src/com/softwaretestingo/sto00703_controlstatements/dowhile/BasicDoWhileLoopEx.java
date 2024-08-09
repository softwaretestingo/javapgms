package com.softwaretestingo.sto00703_controlstatements.dowhile;
import java.util.Scanner;
public class BasicDoWhileLoopEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Learn How do While Loop Works
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number;
		do 
		{
			System.out.print("Enter a positive number: ");
			number = input.nextInt();
		} while (number <= 0);
		System.out.println("You entered: " + number);
	}
}