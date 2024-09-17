package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0083_2_FindKthSmallestElementFromArray 
{
	int a[] = new int[20], n, k;
	// function to take input
	void accept ( )
	{
		int i ;
		// taking the inputs
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		n = sc.nextInt();
		System.out.print ("Enter the array elements : ");
		for (i=0; i<n; i++ )
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the value of k : ");
		k = sc.nextInt();
	}
	//function to find the kth largest or smallest
	void find ( )
	{
		int i, j, t;
		// sorting the list / array in ascending order
		for (i=0; i<n; i++ )
		{
			for (j=0; j<n-i-1; j++)
			{
				if (a[j]>a[j+1])
				{
					t = a[j];
					a[j]= a[j+1];
					a[j+1] = t ;
				}
			}
		}
		// pointing to the kth smallest element
		for (i=0; i<k; i++);
		System.out.print ( "\nThe " + k + " th smallest element is : " + a[i-1]);
	}
	public static void main(String[] args) 
	{
		// creating an object
		STO0083_2_FindKthSmallestElementFromArray k = new STO0083_2_FindKthSmallestElementFromArray();

		// calling the functions
		k.accept();
		k.find();
	}

}