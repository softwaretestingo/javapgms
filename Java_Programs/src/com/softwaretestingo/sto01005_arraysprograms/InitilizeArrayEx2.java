package com.softwaretestingo.sto01005_arraysprograms;
public class InitilizeArrayEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Declare, Initialize and Print the Array Elements
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Array Declaration
		int[] array;
		//Array Initialization
		array = new int[]{1,2,3,4,5};
		//Printing the elements of array
		for (int i =0;i < array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}