package com.softwaretestingo.sto000collectedpgms.interviewprograms.numbers;
public class STO0009_0_SwapTwoNumbers 
{
	/**
	 * Input: a= 1, b= 2
	 * Output: a= 2, b= 1
	 * 
	 */
	public static void main(String args[])
	{
		int a=1;
		int b=2;
		System.out.println("Input: "+"a= "+a+", b= "+ b);
		int c=a+b; //1+2=3
		b=c-b; //3-2=1
		a=c-b; //3-1=2
		System.out.println("Output: "+"a= "+a+", b= "+ b);
	}
}