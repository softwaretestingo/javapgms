package com.softwaretestingo.interviewprograms;

import java.util.Arrays;
import java.util.Comparator;

public class InterviewPrograms18_3 
{
	/*
	 * Input 11001101011 
	 * Output 1111100000 (first numeric 1 and followed by 0s)
	 */
	
	/*
	 * Their an array list consist of multiple 0 and 1 {0,0,1,0,1,1,0,0}etc . So I
	 * want an array list so that it's final outcome become {0,0,0,0 ,0,0,1,1,1,1,1}
	 * etc .
	 */	public static void main ( String args [ ] ) 
	{
		int arr[] = new int[]{ 0,1,0, 1, 0, 1, 1, 1 };
		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) 
		{
			if (arr[i] == 0)
				count++;
		}

		for (int j = 0; j < count; j++)
		{
			arr[j] = 0;
		}
		for (int k = count; k < n; k++)
		{
			arr[k] = 1;
		}
		for (int q = 0; q < n; q++)
		{
			System.out.print(arr[q] + " ");    
		}
	}
}