package com.softwaretestingo.programsonnumbers;
public class OddAndEvenNumber 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Number Is a Odd Or Even Number 
	 *  
	 */
	public static void main(String[] args) 
	{
		int x=5;
		// 4/2-0
		// 3/2-1
		int reminder=x%2;
		if(reminder==1)
		{
			System.out.println("Odd number");
		}
		else
		{
			System.out.println("Even number");
		}
	}
}