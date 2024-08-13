package com.softwaretestingo.sto000collectedpgms.interviewprograms;

public class STO0124_0_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] ar = {3,8,2,3,3,2};
		int[] ar1 = {7,1,2,8,2};
		int[] ar2 = {3,1,4,1,5};
		int[] ar3 = {5,5,5,5,5,5};
		int[] ar4 = {5,5,5,5,5};
		System.out.println(validate(ar));
		System.out.println(validate(ar1));
		System.out.println(validate(ar2));
		System.out.println(validate(ar3));
		System.out.println(validate(ar4));
	}
	public static int validate(int ar[]) 
	{
		int bigNumb=0;
		int count=0;
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]==ar[j]) 
				{
					count++;
				}
			}
			if(count==ar[i]&&bigNumb<ar[i])
			{
				bigNumb=ar[i];
			}
			count=0;
		}
		return bigNumb;						
	}
}