package com.softwaretestingo.programsonnumbers;
public class FibonacciSequenceNumbersWhileLoop 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Fibonacci Sequence Numbers Using While Loop
	 * 
	 */
	public static void main(String[] args) 
	{
		int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		while (i <= n) 
		{
			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;

			i++;
		}
	}
}