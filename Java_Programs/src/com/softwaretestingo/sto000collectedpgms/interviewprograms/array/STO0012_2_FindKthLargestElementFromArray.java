package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Scanner;
public class STO0012_2_FindKthLargestElementFromArray 
{
	int a[] = new int[20], n, k;
	void accept ( )
	{
		int i ;
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
	void find ( )
	{
		int i, j, t;
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

		System.out.print("The sorted list is : ");
		for (i=0; i<n; i++ )
		{
			System.out.print (a[i]+" ");
		}
		if ( 1 == 1 )
		{
			for (i=n-1; i>=n-k; i--) ;
			System.out.print ("\nThe " + k + " th largest element is : " + a [ i + 1 ] ) ;
		}
	}

	public static void main(String[] args) 
	{
		STO0012_2_FindKthLargestElementFromArray k = new STO0012_2_FindKthLargestElementFromArray();

		k.accept();
		k.find();
	}
}