package com.softwaretestingo.sto000collectedpgms.interviewprograms;

public class STO0098_0_InterviewPrograms 
{
	// This Questions Asked In Unify technologies
	//Suppose this is interger array (2,3,4,1,4,5) divide this array into from the index of 
	//that element where sum is equal for both divided arrays for eg:- 
	//1 in this case should be printed as sum of both int arrays (2,3,4) and (4,5) is 9
	public static void main(String[] args) 
	{
		int a[] = {2,3,4,1,4,5};
		int sum1=0;
		int sum2=0;
		int ans=0;
		for (int i = 0; i<=a.length-1; i++) 
		{
			sum1=sum1+a[i];
			for (int j = i+2; j<=a.length-1; j++) 
			{
				sum2=sum2+a[j];
			}
			if(sum1==sum2)
			{
				ans=a[i+1];
			}
			sum2=0;
		}
		System.out.print(ans);
	}
}