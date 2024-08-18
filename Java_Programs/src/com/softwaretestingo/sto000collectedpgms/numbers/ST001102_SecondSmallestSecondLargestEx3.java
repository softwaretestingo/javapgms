package com.softwaretestingo.sto000collectedpgms.numbers;
public class ST001102_SecondSmallestSecondLargestEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Second Lowest & Second Largest Number From Array
	 * 
	 */
	static private int secondSmallest(int[] arr, int n)
	{
		if (n < 2)
		{
			return -1;
		}
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int i;
		for (i = 0; i < n; i++)
		{
			if (arr[i] < small)
			{
				second_small = small;
				small = arr[i];
			}
			else if (arr[i] < second_small && arr[i] != small)
			{
				second_small = arr[i];
			}
		}
		return second_small;
	}
	static private int secondLargest(int[] arr, int n)
	{
		if(n<2)
			return -1;
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		int i;
		for (i = 0; i < n; i++)
		{
			if (arr[i] > large)
			{
				second_large = large;
				large = arr[i];
			}

			else if (arr[i] > second_large && arr[i] != large)
			{
				second_large = arr[i];
			}
		}
		return second_large;
	}
	public static void main(String[] args) 
	{
		int[] arr = {18, 22, 46, 77, 77, 53};
		int n = arr.length;
		int sS = secondSmallest(arr, n);
		int sL = secondLargest(arr, n);
		System.out.println("Second smallest is "+sS);
		System.out.println("Second largest is "+sL);	
	}
}