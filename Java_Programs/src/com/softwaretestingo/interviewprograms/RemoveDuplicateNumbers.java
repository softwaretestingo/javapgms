package com.softwaretestingo.interviewprograms;
public class RemoveDuplicateNumbers  
{
	public static void main(String[] args) 
	{
		int arr[] = {1, 5, 9, 1, 4, 9, 6, 5, 9, 7}; 
		int j;

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