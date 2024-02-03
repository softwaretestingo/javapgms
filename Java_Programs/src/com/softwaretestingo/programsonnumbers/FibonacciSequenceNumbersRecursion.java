package com.softwaretestingo.programsonnumbers;
public class FibonacciSequenceNumbersRecursion 
{
	static int count=20, n, n1=0,n2=1,n3=0;
	public static void main(String[] args) 
	{
		System.out.println("Fibonacci Series Upto " + count + " numbers ");
		//printing 0 and 1  
		System.out.print(n1+" "+n2);

		//Because Already 2 Numbers are Printed 
		printFibonacci(count-2);

	}
	private static void printFibonacci(int count) 
	{
		if(count>0)
		{
			n3 = n1 + n2;  
			n1 = n2;  
			n2 = n3;
			System.out.print(" "+n3); 
			printFibonacci(count-1); 
		}
	}
}