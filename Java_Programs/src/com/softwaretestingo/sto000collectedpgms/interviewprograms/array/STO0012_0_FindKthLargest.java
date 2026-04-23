package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
public class STO0012_0_FindKthLargest 
{
	/**
	 * Input: [17, 24, 6, 3, 39, 1]
	 * Enter the value of k : 2
	 * 2 largest array element From Array is 24
	 */
	public static int findKthLargest(int[] arr, int k) 
	{

        int n = arr.length;

        // Bubble sort in ascending order
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++)
{
                if (arr[j] > arr[j + 1]) 
                {
                    // swap
                    int temp  = arr[j];
                    arr[j]    = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr[n - k]; // kth largest
    }

    public static void main(String[] args) {

        int[] arr = {17, 24, 6, 3, 39, 1};
        int k = 3;

        System.out.println("K           : " + k);
        System.out.println("Kth Largest : " + findKthLargest(arr, k));
    }
}