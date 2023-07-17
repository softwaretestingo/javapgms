package com.softwaretestingo.interviewprograms;
import java.util.Arrays;
public class InterviewPrograms33_1 
{
	/*
	 * Input array- {1,2,3,4,5} 
	 * Output array- {2,1,4,3,5}
	 */
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5};
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
		System.out.println(Arrays.toString(a));
	}
}