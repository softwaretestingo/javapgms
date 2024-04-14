package com.softwaretestingo.collectedpgms.array;
import java.util.HashMap;
public class FindUniqueElements 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Non-Duplicate elements of the Array
	 * 
	 */
	public static void main(String[] args) 
	{
		int[] arr = {4, 5, 5, 7, 6, 6, 7, 4, 9, 5,8};

        // Map to store the count of each element
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) 
        {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print non-duplicate elements
        System.out.println("Non-duplicate elements from the array:");
        for (int num : arr) 
        {
            if (countMap.get(num) ==1) 
            {
                System.out.println(num);
            }
        }
	}
}