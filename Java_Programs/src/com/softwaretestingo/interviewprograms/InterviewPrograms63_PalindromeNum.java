package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class InterviewPrograms63_PalindromeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter num");
		int num=sc.nextInt();
		int rev=0,temp;

		temp=num;

		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);

		if(temp==rev)
		{
			System.out.println("Palindrome Num");
		}
		else 
			System.out.println("not Palindrome Num");
	}
}