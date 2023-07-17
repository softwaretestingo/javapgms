package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class OddEven_Prog2 
{
	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = num.nextInt();

		if(n%2==0)
		{
			System.out.println("The input number is even");
		}
		else
			System.out.println("The input number is odd");
	}
}