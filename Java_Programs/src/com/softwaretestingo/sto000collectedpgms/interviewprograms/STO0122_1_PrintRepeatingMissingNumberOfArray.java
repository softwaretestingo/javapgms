package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0122_1_PrintRepeatingMissingNumberOfArray 
{
	static void printTwoElements(int arr[], int size)
    {
        int i;
        System.out.print("The repeating element is ");
 
        for (i = 0; i < size; i++) 
        {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }
 
        System.out.print("and the missing element is ");
        for (i = 0; i < size; i++) 
        {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }

	public static void main(String[] args) 
	{
		int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
		System.out.println("Input: "+Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Output: ");
        printTwoElements(arr, n);
	}
}