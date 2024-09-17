package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
public class STO0123_0_FindMissingNumberBetweenTwoArray 
{
	private static int missingNumber(int[] arr1, int arr2[]) 
	{
		 
        int missingNumber = arr1[0];
        for (int index = 1; index < arr1.length; index++) 
        {
            missingNumber ^= arr1[index];
        }
 
        for (int index = 0; index < arr2.length; index++) 
        {
            missingNumber ^= arr2[index];
        }
        return missingNumber;
    }
	public static void main(String[] args) 
	{
		int array1[] = { 1, 2, 3, 4, 5 };
        int array2[] = { 1, 2, 4, 5 };
 
        String sArr1 = Arrays.toString(array1);
        String sArr2 = Arrays.toString(array2);
 
        System.out.printf("1. Missing number in array1 & array2 is:", sArr1, sArr2);
        int missingNumber = missingNumber(array1, array2);
        System.out.printf(" %d", missingNumber);
 
        array1 = new int[] { 10, 20, 30, 40 };
        array2 = new int[] { 20, 30, 40,  };
 
        sArr1 = Arrays.toString(array1);
        sArr2 = Arrays.toString(array2);
 
        System.out.printf("\n2. Missing number in array1 & array2 is:", sArr1, sArr2);
        missingNumber = missingNumber(array1, array2);
        System.out.printf(" %d", missingNumber);
	}
}