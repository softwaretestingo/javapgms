package com.softwaretestingo.sto000collectedpgms.numbers;
public class ST000603_SwapNumbersEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Swap Two Numbers With The Help Of XOR
	 * 
	 */
	public static void main(String[] args) 
	{
	    int a=5;
	    int b=4;
	    
	    System.out.println("Before Swap the Value Of A & B: "+a+" "+b);
	    //^ -> XOR 1 1 -> 0, 1 0  -> 1, 0 0  -> 0,  0 1  -> 1 
	    
	    a = a^b; // 1 0 1 XOR 1 0 0  -> 0 0 1
	    b = a^b; // 0 0 1 XOR 1 0 0  -> 1 0 1  ->5
	    a = a^b; // 0 0 1 XOR 1 0 1   ->1 0 0  ->4
	    
	    System.out.println("After Swap the Value Of A & B: "+a+" "+b);
	}
}