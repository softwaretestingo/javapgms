package com.softwaretestingo.sto000collectedpgms.numbers;
public class ST000604_SwapNumbersEx4 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Swap Two Numbers With Out Using Third Variable
	 * 
	 */
	public static void main(String[] args) 
	{
	    int a=5;
	    int b=4;
	    
	    System.out.println("Before Swap the Value Of A & B: "+a+" "+b);
	   
	    
	    a = a*b;
	    b = a/b;
	    a = a/b;
	    
	    System.out.println("After Swap the Value Of A & B: "+a+" "+b);
	}
}