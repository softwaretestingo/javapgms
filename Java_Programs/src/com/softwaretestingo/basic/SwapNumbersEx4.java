package com.softwaretestingo.basic;
public class SwapNumbersEx4 
{
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