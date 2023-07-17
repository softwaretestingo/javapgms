package com.softwaretestingo.interviewprograms;
public class Palindrome_Prog5 
{
	public static void main(String[] args) 
	{	
		int sum=0,temp;
		int n=5405;
		temp=n;
		
		while(n>0)
		{
			sum=(sum*10)+n%10;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("palindrome number ");  
		else
			System.out.println("Not a palindrome number ");  
	}
}