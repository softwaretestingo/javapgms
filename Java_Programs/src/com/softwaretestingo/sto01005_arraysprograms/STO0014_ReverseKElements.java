package com.softwaretestingo.sto01005_arraysprograms;
public class STO0014_ReverseKElements 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Reverse K elements Of The Array
	 * 
	 */
	public static void main(String[] args) 
	{
		int[] arr = { 1, 2, 4, 6, 9, 4 };
        int k = 2;
        
        reverseKElements(arr, k);
        
        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
	public static void reverseKElements(int[] arr, int k) 
	{
        if (arr == null || arr.length == 0 || k <= 0 || k >= arr.length) 
        {
        	// Invalid input
        	return;
        }
        
        // Reverse the first part of the array (from index 0 to k-1)
        reverseArray(arr, 0, k - 1);
        
        // Reverse the second part of the array (from index k to the end)
        reverseArray(arr, k, arr.length - 1);
        
        // Reverse the entire array to get the correct order
        reverseArray(arr, 0, arr.length - 1);
    }
    
    public static void reverseArray(int[] arr, int start, int end) 
    {
        while (start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}