package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0058_0_FibonacciSeriesProgram 
{
	public static void main(String[] args) 
	{	
		int a=0,b=1,c,n=5;
		System.out.println(a+"\n"+b);

		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c); 
			a=b;
			b=c;
		}
	}
}