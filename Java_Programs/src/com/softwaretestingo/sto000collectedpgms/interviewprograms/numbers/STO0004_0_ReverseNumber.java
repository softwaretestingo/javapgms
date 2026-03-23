package com.softwaretestingo.sto000collectedpgms.interviewprograms.numbers;
import java.util.Scanner;
public class STO0004_0_ReverseNumber 
{	
	/**
	 * Enter a number 12345
	 * Input:12345
	 * Output: 54321
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int num=sc.nextInt();
		System.out.println("Input:"+num);
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Output: "+rev);
	}
}
