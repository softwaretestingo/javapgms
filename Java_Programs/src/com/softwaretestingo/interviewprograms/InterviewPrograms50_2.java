package com.softwaretestingo.interviewprograms;
import java.text.DecimalFormat;
import java.util.Scanner;
public class InterviewPrograms50_2 
{
	/*
	 * Input is a phone number Ex : 1234567890 
	 * Output: (123)45-67-890
	 */
	public static void main(String[] args) 
	{
		long n=10;
		int a[]=new int[10]; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digits of phone number");
		for(int i=0;i<n;i++)
		{

			a[i]=sc.nextInt();
			if(a[i]<0 || a[i]>9)
			{

				System.out.print("wrong input");
				return;
			}

			System.out.println("");

		}  

		System.out.print("phone number format--->");
		for(int i=0;i<n;i++)
		{
			if(i==0)
				System.out.print("\"(");
			if(i==3)
				System.out.print(") ");

			if(i==6)
				System.out.print("-");

			System.out.print(a[i]);
		}
	}
}