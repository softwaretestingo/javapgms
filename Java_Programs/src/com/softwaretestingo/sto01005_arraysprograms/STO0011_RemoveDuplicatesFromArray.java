package com.softwaretestingo.sto01005_arraysprograms;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class STO0011_RemoveDuplicatesFromArray 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Remove Duplicate Values From the Array
	 * 
	 */
	public static void main(String[] args) 
	{
		// Input array
		int[] input = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };

		// HashSet to store unique elements
		Set<Integer> uniqueElements = new HashSet<>();

		// Add elements from the input array to the HashSet
		for (int num : input) 
		{
			uniqueElements.add(num);
		}

		// Convert HashSet back to array
		int[] output = new int[uniqueElements.size()];
		int index = 0;
		for (int num : uniqueElements) 
		{
			output[index++] = num;
		}

		// Sort the output array (optional, if you want the output to be sorted)
		Arrays.sort(output);

		// Output the unique elements
		System.out.println("Original Array: " + Arrays.toString(input));
		System.out.println("Output String: " + Arrays.toString(output));
	}
}