package com.softwaretestingo.sto01005_arraysprograms;
public class STO0006_FindSecondLargestAndSmallestValue 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find The Second Largest & Second Smallest Value Of The Array
	 * 
	 */
	public static void main(String[] args) 
	{
		int arr[] = new int[] { 2, 4, 10, 8, 11, 13, 15 };
		int temp = 0;
		int index=0;
		int size = arr.length;

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				// if told to sort in descending order then change the greater symbol to arr[j]
				if (arr[i] < arr[j]) 
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		/*
		 * System.out.println();
		 * System.out.println("Elements of sorted array in ascending order ");
		 */
		for (int k=0; k < arr.length; k++) 
		{
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		System.out.println("Second Largest in a array " + arr[index+1]);

		// if you want find second smallest in array..THen sort it to descending order
		// and get size-value
		System.out.println("Second Smallest in a array " + arr[size - 2]);
	}
}