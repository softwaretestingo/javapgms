package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
public class STO0101_1_MultiplyAdjacentValuesOfAnArray 
{
	/*
	 * Write a java program to given array arr [ 1,2,3,4 ] to multiple thee number 
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
		// Initialize memory to all arrays
		int left[] = new int[n];
		int right[] = new int[n];
		int prod[] = new int[n];

		int i, j;

		/* Left most element of left array is always 1 */
		left[0] = 1;

		/* Right most element of right array is always 1 */
		right[n - 1] = 1;

		/* Construct the left array */
		for (i = 1; i < n; i++)
			left[i] = arr[i - 1] * left[i - 1];

		/* Construct the right array */
		for (j = n - 2; j >= 0; j--)
			right[j] = arr[j + 1] * right[j + 1];

		/* Construct the product array using left[] and right[] */
		for (i = 0; i < n; i++)
			prod[i] = left[i] * right[i];

		/* print the constructed prod array */
		for (i = 0; i < n; i++)
			System.out.print(prod[i] + " ");

		return;
	}

	public static void main(String[] args) 
	{
		STO0101_1_MultiplyAdjacentValuesOfAnArray pa = new STO0101_1_MultiplyAdjacentValuesOfAnArray();
		int arr[] = { 1,2,3,4 };
		int n = arr.length;
		System.out.println("Inputted Array Is: "+Arrays.toString(arr));
		System.out.print("The product array is : ");
		pa.multipleValue(arr, n);
	}
}