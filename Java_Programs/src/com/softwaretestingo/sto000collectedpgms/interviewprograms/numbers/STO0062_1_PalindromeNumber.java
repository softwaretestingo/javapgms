package com.softwaretestingo.sto000collectedpgms.interviewprograms.numbers;
import java.util.Scanner;
public class STO0062_1_PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter Num: ");
		int num=sc.nextInt();
		int rev=0,temp;

		temp=num;

		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		//System.out.println(rev);

		if(temp==rev)
		{
			System.out.println("Output: "+ "Palindrome Number ");  
		}
		else 
			System.out.println("Output: "+ "Not a Palindrome Number ");  
	}
}