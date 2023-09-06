package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class InterviewPrograms86 
{
	public static void main(String[] args)
	{
		int i,n,count;
		System.out.println("Enter the Value of N: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		System.out.println("Prime Numbers Between 1 to "+n+" are: ");
		for(int j=2;j<=n;j++)
		{
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;        
				}
			}
			if(count==2)
				System.out.print(j+"  ");     
		}
	}
}