package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class ST000201_FibonacciSequenceNumbersNth 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Nth Fibonacci Sequence Numbers 
	 * 
	 */
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter how many fibonnaci numbers to print: ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 0; i<=n-1; ++i)
		{
			System.out.print(fibonaccinumber(i) + " ");
		}
	}
	public static int fibonaccinumber(int n) 
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibonaccinumber(n-1) + fibonaccinumber(n-2);
	} 
}