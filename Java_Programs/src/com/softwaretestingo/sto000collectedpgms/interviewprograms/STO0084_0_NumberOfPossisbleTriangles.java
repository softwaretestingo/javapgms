package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
public class STO0084_0_NumberOfPossisbleTriangles 
{
	static int countTriangles(int[] arr, int n)
	{
		// atleast 3 numbers are required for a triangle.
		if(n<3) return 0;
		
		// Sort the array
        Arrays.sort(arr);
		int count = 0;
		int i = 0;
		int j = i+1;
		while(i<n-2)
		{
			int k = j+1;
			while(k<n && arr[k] < arr[i] + arr[j])
				k++;
			count += k-j-1;
			j++;
			// If j has reached the end. then reset both i & j.
			if(j>=n)
			{
				i++;
				j = i+1;
			}
		}
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