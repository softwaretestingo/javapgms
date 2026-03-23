package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Arrays;
import java.util.Scanner;
public class STO0013_0_FindKthSmallestElementFromArray 
{
	public static int kthSmallest(Integer[] arr, int K)
	{
		Arrays.sort(arr);
		return arr[K - 1];
	}

	public static void main(String[] args) 
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		System.out.println("Input: "+Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of k : ");
		int K = sc.nextInt();

		// Function call
		System.out.print("K'th smallest element is "+ kthSmallest(arr, K));
	}

}