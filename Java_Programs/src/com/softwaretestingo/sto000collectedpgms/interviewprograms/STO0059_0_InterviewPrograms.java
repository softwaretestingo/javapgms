package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0059_0_InterviewPrograms 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
}
