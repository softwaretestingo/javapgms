package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0021_4_InterviewPrograms 
{
	/*
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 * WITH OUT BUILT IN FUNCTION
	 */
	public static void main(String[] args) 
	{
		int zeroCount = 0 ;
		int [ ] arr = { 5 , 0 , 4 , 6 , 0 , 7 , 0 };
		System.out.println("Input: "+Arrays.toString(arr));
		for (int i =0 ; i<arr.length ; i++ ) 
		{
			if (arr[i] == 0)
			{
				zeroCount ++ ;
			}
		}
		int arr1 [] = new int[arr.length];
		for ( int i=0 ; i<zeroCount; i++) {
			arr1[i]=0;
		}

		int newIndex=0;
		for (int i=0 ; i<arr.length; i++ ) 
		{
			if ( arr[i]>0 ) 
			{
				arr1[zeroCount+newIndex]= arr[i];
				newIndex ++ ;
			}

		}
		System.out.print("Output: ");
		for ( int i=0 ; i<arr1.length; i++ ) 
		{
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		System.out.println ("Zero count is : " +zeroCount);
	}
}