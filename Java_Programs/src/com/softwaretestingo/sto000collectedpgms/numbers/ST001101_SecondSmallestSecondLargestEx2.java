package com.softwaretestingo.sto000collectedpgms.numbers;
public class ST001101_SecondSmallestSecondLargestEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Second Lowest & Second Largest Number From Array
	 * 
	 */
	static private void getElements(int[] arr, int n)
	{
		if (n == 0 || n==1)
		{
			System.out.print(-1);
			System.out.print(" ");
			System.out.print(-1);
			System.out.print("\n");
		}
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		int i;
		for (i = 0;i < n;i++)
		{
			small = Math.min(small,arr[i]);
			large = Math.max(large,arr[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (arr[i] < second_small && arr[i] != small)
			{
				second_small = arr[i];
			}
			if (arr[i] > second_large && arr[i] != large)
			{
				second_large = arr[i];
			}
		}

		System.out.println("Second smallest is "+second_small);
		System.out.println("Second largest is "+second_large);
	}

	public static void main(String[] args) 
	{
		int[] arr = {11, 22, 54, 96, 37, 55};
		int n = arr.length;
		getElements(arr, n);	
	}
}