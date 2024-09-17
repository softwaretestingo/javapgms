package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0089_1_MountArray 
{
	// Find Whether A Subarray Is In Form Of A Mountain Or Not
	static void buildArrays(int arr[], int N, int arrayL[], int arrayR[])
	{
		arrayL[0] = 0;
		int increasingNumber = 0;
		for (int i = 1; i < N; i++)
		{
			if (arr[i] > arr[i - 1])
				increasingNumber = i;
			arrayL[i] = increasingNumber;
		}
		arrayR[N - 1] = N - 1;
		int decreasingNumber = N - 1;
		for (int i = N - 2; i >= 0; i--)
		{
			if (arr[i] > arr[i + 1])
				decreasingNumber = i;
			arrayR[i] = decreasingNumber;
		}
	}

	static boolean solveQuery(int arr[], int arrayL[], int arrayR[], int Left, int Right)
	{
		return (arrayR[Left] >= arrayL[Right]);
	}
	public static void main(String[] args)
	{
		int arr[] = {3,4,5,6,1,5,1,2,1};
		int N = arr.length;
		int arrayL[] = new int[N];
		int arrayR[] = new int[N];
		buildArrays(arr, N, arrayL, arrayR);
		int L = 0;
		int R = 3;
		if (solveQuery(arr, arrayL, arrayR, L, R))
			System.out.println("Mountain form");
		else
			System.out.println("Not a mountain form");
		L = 5;
		R = 7;
		if (solveQuery(arr, arrayL, arrayR, L, R))
			System.out.println("Mountain form");
		else
			System.out.println("Not a mountain form");
	}
}