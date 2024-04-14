package com.softwaretestingo.programsonnumbers;
public class FibonacciSequenceNumbersForLoop 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Fibonacci Sequence Numbers Using For Loop
	 * 
	 */
	public static void main(String[] args) 
	{
		int n = 10, firstTerm = 0, secondTerm = 1;

		System.out.println("Fibonacci Series Upto " + n + " Numbers ");

		for (int i = 1; i <= n; ++i) 
		{
			System.out.print(firstTerm + " ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}