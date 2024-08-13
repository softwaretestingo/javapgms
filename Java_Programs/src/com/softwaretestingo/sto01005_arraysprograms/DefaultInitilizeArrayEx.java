package com.softwaretestingo.sto01005_arraysprograms;
public class DefaultInitilizeArrayEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Initialize Array
	 *
	 */
	public static void main(String[] args) 
	{
		//Initializing array
		int[] array = new int[5];
		
		//Printing the elements of array
		for (int i=0; i<5; i++)
		{
			array[i]=i;
			System.out.println(array[i]);
		}	
	}
}