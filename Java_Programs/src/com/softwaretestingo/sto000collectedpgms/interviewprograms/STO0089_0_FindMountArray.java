package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0089_0_FindMountArray 
{
	public static boolean validMountArray(int[] Arr) 
	{
		int i = 0;
		int j = Arr.length - 1;
		int n = Arr.length - 1;
		while (i + 1 < n && Arr[i] < Arr[i+1]) 
		{
			i++;
		}

		while (j > 0 && Arr[j] < Arr[j-1]) 
		{
			j--;
		}

		return (i > 0 && i == j && j < n);
	}
	public static void main(String[] args)
	{
		int num,i;

		// taking the inputs
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		num = sc.nextInt();
		int arr[]=new int[num];
		System.out.print ("Enter the array elements : ");
		for (i=0; i<num; i++ )
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Is a Mount Array: "+validMountArray(arr));
	}
}