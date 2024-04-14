package com.softwaretestingo.array;
public class ReturnArrayEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: How to Return Array
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int arr[] = method1();

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	public static int[] method1()
	{
		// returning  array
		return new int[]{1,2,3};
	}
}