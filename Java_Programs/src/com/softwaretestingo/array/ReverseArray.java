package com.softwaretestingo.array;
public class ReverseArray 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print the Array Elements in Reverse Order
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4, 5};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}