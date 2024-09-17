package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0086_0_InterviewPrograms 
{
	public static void main(String[] args)
	{
		int i,n,count;
		System.out.print("Enter the Value of N: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		System.out.print("Prime Numbers Between 1 to "+n+" are: ");
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