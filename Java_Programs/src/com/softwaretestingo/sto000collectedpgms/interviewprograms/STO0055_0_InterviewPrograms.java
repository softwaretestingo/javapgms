package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0055_0_InterviewPrograms 
{
	/*
	 * Write classes to find any pairs of numbers in a sequence that add up to 10.
	 * Example:
	 * 
	 * Sample input: 1, 8, 2, 3, 5, 7 
	 * Sample output: “(8,2), (3, 7)”
	 */
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,9,5,6,7,8,10,0};
		System.out.println("The Combinations in the array whose sum is 10 are:");
		STO0055_0_InterviewPrograms.combinator(a);
	}
	public static void combinator(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j=a.length-1;j>=0;j--)
			{
				sum=a[i]+a[j];
				if(sum==10 && a[i]<=a[j] && a[i]!=a[j])
				{
					System.out.println("("+a[i]+","+a[j]+")");
				}
			}
		}
	}
}