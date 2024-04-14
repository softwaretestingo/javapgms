package com.softwaretestingo.array;
import java.util.Arrays;
import java.util.Scanner;
public class DivideArrayIntoHalf_WithoutUsingInBuiltFunction 
{
	/**
	 * 
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Divide An Array Into Two equal 
	 * SubArrays Without Using Any Built in Methods Of Java
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the required size of the array: ");
		int size = s.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter elements of the array: ");
		for (int i = 0; i < size; i++) 
		{
			myArray[i] = s.nextInt();
		}
		int n = myArray.length;

		int[] array1 = new int[(n + 1) / 2];
		int[] array2 = new int[n - array1.length];

		for (int i = 0; i < n; i++) 
		{
			if (i < array1.length) 
			{
				array1[i] = myArray[i];
			} 
			else 
			{
				array2[i - array1.length] = myArray[i];
			}
		}
		System.out.println("Original Array Is: " + Arrays.toString(myArray));
		System.out.println("First Array: " + Arrays.toString(array1));
		System.out.println("Second Array: " + Arrays.toString(array2));
	}
}