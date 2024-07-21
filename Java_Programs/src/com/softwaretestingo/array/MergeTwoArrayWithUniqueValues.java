package com.softwaretestingo.array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class MergeTwoArrayWithUniqueValues 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Create a Unique Array (Without Duplicate) By Merging Two Arrays
	 * 
	 */
	public static void main(String[] args) 
	{
		// Arrays provided
        String[] array1 = {"Ava", "Emma", "Olivia"};
        String[] array2 = {"Olivia", "Sophia", "Emma"};
        
        // HashSet to store unique elements from both arrays
        Set<String> mergedArray = new HashSet<>();
        
        // Adding elements from array1 to the HashSet
        for (String element : array1) 
        {
        	mergedArray.add(element);
        }
        
        // Adding elements from array2 to the HashSet
        for (String element : array2) 
        {
        	mergedArray.add(element);
        }
        
        // Convert HashSet to array
        String[] outputArray = mergedArray.toArray(new String[0]);
        
        // Output the result
        System.out.println("First Array: "+Arrays.toString(array1));
        System.out.println("Second Array: "+Arrays.toString(array2));
        System.out.println("Merged Array: "+Arrays.toString(outputArray));
	}
}