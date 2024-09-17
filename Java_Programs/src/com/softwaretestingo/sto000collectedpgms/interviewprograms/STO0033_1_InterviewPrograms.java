package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
public class STO0033_1_InterviewPrograms 
{
	/*
	 * Input array- {1,2,3,4,5} 
	 * Output array- {2,1,4,3,5}
	 */
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5};
		System.out.println("Input: "+Arrays.toString(a));
		if ( a.length % 2 == 1 )
		{ 
			for ( int i = 0 ; i<a.length-1; i=i+2) 
			{
				int temp= a[i];
				a[i]= a[i+1];
				a[i+1]=temp;
			}
		}
		else if (a.length%2==0) 
		{
			for (int i=0; i<a.length; i=i+2)
			{
				int temp= a[i];
				a[i] = a[i+1];
				a[i+1]= temp ;
			}
		}
		System.out.println("Output: "+Arrays.toString(a));
	}
}