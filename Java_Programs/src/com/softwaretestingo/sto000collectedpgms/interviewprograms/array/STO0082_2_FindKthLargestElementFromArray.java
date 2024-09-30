package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Scanner;
public class STO0082_2_FindKthLargestElementFromArray 
{
	int a[] = new int[20], n, k;
	// function to take input
	void accept ( )
	{
		int i ;
		// taking the inputs
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size Of The Array : ");
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


		// printing the sorted array
		System.out.print("The sorted list is : ");
		for (i=0; i<n; i++ )
		{
			System.out.print (a[i]+" ");
		}
		// finding the kth largest element
		if ( 1 == 1 )
		{
			// pointing to the kth largest element
			for (i=n-1; i>=n-k; i--) ;
			System.out.print ("\nThe " + k + " th largest element is : " + a [ i + 1 ] ) ;
		}
	}

	public static void main(String[] args) 
	{
		// creating an object
		STO0082_2_FindKthLargestElementFromArray k = new STO0082_2_FindKthLargestElementFromArray();

		// calling the functions
		k.accept();
		k.find();
	}
}