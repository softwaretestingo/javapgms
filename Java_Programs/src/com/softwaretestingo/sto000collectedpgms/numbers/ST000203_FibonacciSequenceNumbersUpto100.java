package com.softwaretestingo.sto000collectedpgms.numbers;
public class ST000203_FibonacciSequenceNumbersUpto100 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Fibonacci Sequence Numbers upto 100
	 * 
	 */
	public static void main(String[] args) 
	{
		int n = 100, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series Upto " + n + ": ");

		while (firstTerm <= n) 
		{
			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}