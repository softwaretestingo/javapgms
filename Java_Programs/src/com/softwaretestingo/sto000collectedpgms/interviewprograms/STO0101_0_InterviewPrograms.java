package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
public class STO0101_0_InterviewPrograms 
{
	/*
	 * Write a java program to given array arr [ 1,2,3,4 ] to multiple the number 
	 * and ignore one for next ignore another one  number and continue 
	 * same so  we will get out put [ 24,12,8,6 ] 
	 */

	//This Questions Asked in Cigniti technologies
	void multipleValue(int arr[], int n) 
	{
		// If Only 1 Element is passed
		if (n == 1) 
		{
			System.out.print(0);
			return;
		}
		int i, temp = 1;

		/* Allocate memory for the product array */
		int prod[] = new int[n];

		/* Initialize the product array as 1 */
		for (int j = 0; j < n; j++)
			prod[j] = 1;

		/* In this loop, temp variable contains product of
           elements on left side excluding arr[i] */
		for (i = 0; i < n; i++) 
		{
			prod[i] = temp;
			temp *= arr[i];
		}

		/* Initialize temp to 1 for product on right side */
		temp = 1;

		/* In this loop, temp variable contains product of
           elements on right side excluding arr[i] */
		for (i = n - 1; i >= 0; i--) 
		{
			prod[i] *= temp;
			temp *= arr[i];
		}

		/* print the constructed prod array */
		for (i = 0; i < n; i++)
			System.out.print(prod[i] + " ");

		return;
	}

	public static void main(String[] args) 
	{
		STO0101_0_InterviewPrograms pa = new STO0101_0_InterviewPrograms();
		int arr[] = { 1,2,3,4 };
		int n = arr.length;
		System.out.println("Input: "+Arrays.toString(arr));
		System.out.print("Output: ");
		pa.multipleValue(arr, n);
	}
}
