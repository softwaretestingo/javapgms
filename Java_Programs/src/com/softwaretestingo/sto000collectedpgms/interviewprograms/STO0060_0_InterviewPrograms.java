package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0060_0_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		Scanner num = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int n = num.nextInt();

		if(n%2==0)
		{
			System.out.println("The input number is even");
		}
		else
			System.out.println("The input number is odd");
	}
}