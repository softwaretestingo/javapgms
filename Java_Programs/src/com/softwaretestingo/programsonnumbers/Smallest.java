package com.softwaretestingo.programsonnumbers;
import java.util.Arrays;
public class Smallest 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Smallest Number From Array
	 * 
	 */
	public static boolean sumNo(int n, int N)
	{
		int sum=0;
		while (n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		if(sum==N)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int[] arr = { 97, 898, 5506, 79, 22822 };
		Arrays.sort(arr);
		for (int i= 0; i < arr.length; i++) 
		{ 
			if (sumNo(arr[i], 16)) 
			{
				System.out.println("Smallest No Is: " + arr[i]);
				break;
			}
		}
	}
}