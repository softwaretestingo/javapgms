package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0122_0_PrintRepeatingMissingNumberOfArray 
{
	static void printTwoElements(int[] arr, int n)
    {
        int[] temp = new int[n]; // Creating temp array of size n
        
        // with initial values as 0.
        int repeatingNumber = -1;
        int missingNumber = -1;
 
        for (int i = 0; i < n; i++) 
        {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) 
            {
                repeatingNumber = arr[i];
            }
        }
        for (int i = 0; i < n; i++) 
        {
            if (temp[i] == 0) 
            {
                missingNumber = i + 1;
                break;
            }
        }
 
        System.out.println("The repeating number is " + repeatingNumber + ".");
        System.out.println("The missing number is " + missingNumber + ".");
    }

	public static void main(String[] args) 
	{
		int[] arr = { 7, 3, 4, 5, 5, 6, 2 };
		System.out.println("Input: "+Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Output: ");
        printTwoElements(arr, n);
	}
}