package com.softwaretestingo.array;
import java.util.Arrays;
import java.util.Scanner;
public class DivideArrayFrom_SpecificPosition 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement:  Divide An Array From Specific Position
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the required size of the array: ");
		int size = s.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter elements of the array");
		for (int i = 0; i < size; i++) 
		{
			myArray[i] = s.nextInt();
		}

		// Enter the position from where you want to split the array
		System.out.println("Enter the position of the array : ");
		int position = s.nextInt();

		// Array to store the first half
		int array1[] = new int[position];
		int z = size - position;
		// Array to store the second half of the array
		int array2[] = new int[z];

		// Copy the first half elements
		for (int i = 0; i < position; i++) 
		{
			array1[i] = myArray[i];
		}

		// Copy the second half elements
		int k = 0;
		for (int i = position; i < size; i++) 
		{
			array2[k] = myArray[i];
			k++;
		}
		
		System.out.println("Original Array Is: "+Arrays.toString(myArray));
		System.out.println("First Array: "+Arrays.toString(array1));
		System.out.println("Second Array: "+Arrays.toString(array2));
	}
}