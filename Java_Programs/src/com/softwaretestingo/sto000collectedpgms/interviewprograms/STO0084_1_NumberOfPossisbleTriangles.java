package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
public class STO0084_1_NumberOfPossisbleTriangles 
{
	//https://iq.opengenus.org/maximum-perimeter-of-triangle/
	static int countTriangles(int[] arr, int n)
	{
		// Function to count all possible triangles with arr[] 	    
		// elements
		
		// Sort the array
		Arrays.sort(arr);
		// Count of triangles
		int count = 0;
		// The three loops select three different values
		// from array
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				for (int k = j + 1; k < n; k++)
					if (arr[i] + arr[j] > arr[k])
						count++;
		return count;
	}

	public static void main(String[] args) 
	{
		int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
		int size = arr.length;

		// Function call
		System.out.println("Total number of triangles possible is "+ countTriangles(arr, size));
	}

}