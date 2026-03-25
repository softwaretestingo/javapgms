package com.softwaretestingo.sto000collectedpgms.interviewprograms.numbers;
import java.util.Scanner;
public class STO0008_0_CheckPrime 
{
	public static void main(String[] args) 
	{
		/**
		 * Enter a number: 12345
		 * Not a prime number 
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num =sc.nextInt();
		
		int count= 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;	        
			}
		}
		if(count==2)
			System.out.println("prime number ");
		else
			System.out.println("Not a prime number ");        
	} 
}