package com.softwaretestingo.interviewprograms;
public class Fibonacci_Prog4 
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