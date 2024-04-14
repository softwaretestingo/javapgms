package com.softwaretestingo.array;
public class PassingArrayAsMethodEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Pass Array to a Method
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int arr[] = {3, 1, 2, 5, 4};

		// passing array to method m1
		sum(arr);
	}
	public static void sum(int[] arr)
	{
		// getting sum of array values
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum+=arr[i];

		System.out.println("sum of array values : " + sum);
	}
}