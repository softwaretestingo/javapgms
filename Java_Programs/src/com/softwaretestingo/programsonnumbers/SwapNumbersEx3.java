package com.softwaretestingo.programsonnumbers;
public class SwapNumbersEx3 
{
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