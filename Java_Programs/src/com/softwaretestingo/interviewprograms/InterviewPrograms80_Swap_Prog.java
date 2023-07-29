package com.softwaretestingo.interviewprograms;
public class InterviewPrograms80_Swap_Prog 
{
	public static void main(String args[])
	{
		int a=1;
		int b=2;

		int c=a+b; //1+2=3
		b=c-b; //3-2=1
		a=c-b; //3-1=2
		System.out.println("b ="+ b + " a =" + a );

		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("b ="+ b + " a =" + a );	
		 */
	}
}