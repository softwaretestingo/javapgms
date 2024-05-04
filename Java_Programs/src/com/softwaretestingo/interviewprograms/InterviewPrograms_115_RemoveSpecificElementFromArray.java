package com.softwaretestingo.interviewprograms;

import java.util.HashSet;

public class InterviewPrograms_115_RemoveSpecificElementFromArray {
	/**
	 * Author: SoftwareTestingo Admin 
	 * Blog: www.softwaretestingo.com 
	 * 
	 * Problem Statement: Remove The Specific Number From The Array
	 * 
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 */
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5};
        int numberToRemove = 5;
        array = removeNumberFromArray(array, numberToRemove);
        
        // Print the array after removal
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] removeNumberFromArray(int[] arr, int num) 
    {
        int[] result = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] != num) {
                result[j++] = arr[i];
            }
        }
        return result;
    }
}