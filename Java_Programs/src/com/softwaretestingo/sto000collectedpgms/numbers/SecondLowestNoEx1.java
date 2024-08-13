package com.softwaretestingo.sto000collectedpgms.numbers;
public class SecondLowestNoEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find The Second Lowest Number From Array
	 * 
	 */
	static int secSmallest(int arr[], int n)
	{
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

		for (int i=0; i < n; i++)
		{
			if(arr[i] < first)
			{
				second = first; first = arr[i]; 
			} 
			else if(second>arr[i])
				second = arr[i];
		}

		return second;

	}
	public static void main(String[] args) 
	{
		int arr[] = {12, 13, 1, 10, 34, 10};
		int n = arr.length;
		System.out.print("Second Lowest Number: " +secSmallest(arr, n)); 
	}
}