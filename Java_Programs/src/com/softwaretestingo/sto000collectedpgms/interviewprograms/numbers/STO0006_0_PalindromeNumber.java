package com.softwaretestingo.sto000collectedpgms.interviewprograms.numbers;
public class STO0006_0_PalindromeNumber 
{
	/**
	 * Input: 5405
	 * Output: Not a Palindrome Number
	 * 
	 */
	public static void main(String[] args) 
	{	
		int sum=0,temp;
		int n=5405;
		System.out.println("Input: "+n);
		temp=n;
		
		while(n>0)
		{
			sum=(sum*10)+n%10;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Output: "+ "Palindrome Number ");  
		else
			System.out.println("Output: "+ "Not a Palindrome Number ");  
	}
}