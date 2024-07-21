package com.softwaretestingo.array;
public class FindMissingNumber 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Missing Number From the Array
	 * 					  This will Work if There is Only One Missing Number	
	 * 
	 */
	public static void main(String[] args) 
	{
		 int[] arr = { 1,2,4,3,5,7 };
		 int size=arr.length;
		 int sum = ((size + 1) * (size + 2)) / 2;
		 for(int i=0;i<size;i++)
		 {
			 sum -= arr[i];
		 }
		System.out.println("The Missing Number is: "+sum);
	}
}