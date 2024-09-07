package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0070_0_InterviewPrograms  
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 5, 9, 1, 4, 9, 6, 5, 9, 7}; 
		System.out.println("Input: "+Arrays.toString(arr));
		int j;
		System.out.print("Output: ");
		for (int i = 0; i < arr.length; i++) 
		{ 	
			for (j = 0; j < i; j++) 
			{
				if (arr[i] == arr[j]) 
					break; 
			}
			if (i == j) 
			{
				System.out.print( arr[i] + " "); 
			}
		} 
	}
}