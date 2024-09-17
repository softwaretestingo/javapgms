package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0080_0_SwapTwoNumbers 
{
	public static void main(String args[])
	{
		int a=1;
		int b=2;
		System.out.println("Input: "+"a= "+a+", b= "+ b);
		int c=a+b; //1+2=3
		b=c-b; //3-2=1
		a=c-b; //3-1=2
		System.out.println("Output: "+"a= "+a+", b= "+ b);

		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("b ="+ b + " a =" + a );	
		 */
	}
}