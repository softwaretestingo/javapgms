package com.softwaretestingo.sto01005_arraysprograms;
public class STO0004_FindMissingNumberInArray 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Missing Number From the Array
	 * 
	 */
	public static void main(String[] args) 
	{
		int a[] = { 1, 2, 3, 4, 6 };

		int size = a.length;
		int sum = (size + 1) * (size + 2) / 2;
		for (int i = 0; i < size; i++) 
		{
			sum = sum - a[i];
		}
		System.out.println("Sum of elements in array is " + sum);
	}
}