package com.softwaretestingo.collectedpgms.array;
public class LinearSearchInArray 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Specific Element in the Array and Its Index
	 * 
	 */
	public static void main(String[] args) 
	{
		int a[] = { 10, 20, 30, 40, 50 };
		int searchele = 50;
		boolean flag = false;

		for (int i = 0; i < a.length; i++) 
		{
			if (searchele == a[i]) 
			{
				System.out.println("Value is found at Index " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) 
		{
			System.out.println("Value is not found");
		}
	}
}