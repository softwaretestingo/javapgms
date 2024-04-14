package com.softwaretestingo.programsonnumbers;
public class SwapNumbersEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Swap Two Number With The Help Of Third Variable
	 * 
	 */
	public static void main(String[] args) 
	{
	    int a=5;
	    int b=4;
	    
	    System.out.println("Before Swap the Value Of A & B: "+a+" "+b);
	    
		int temp;
	    temp=a; // temp=5
	    a=b; //a=4;
	    b=temp; //b=5
	    
	    System.out.println("After Swap the Value Of A & B: "+a+" "+b);

	}
}