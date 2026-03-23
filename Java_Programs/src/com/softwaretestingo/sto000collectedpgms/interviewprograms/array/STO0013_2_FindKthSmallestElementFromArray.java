package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Scanner;
public class STO0013_2_FindKthSmallestElementFromArray 
{
	int a[] = new int[20], n, k;
	void accept ( )
	{
		int i ;
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
		for (i=0; i<k; i++);
		System.out.print ( "\nThe " + k + " th smallest element is : " + a[i-1]);
	}
	public static void main(String[] args) 
	{
		STO0013_2_FindKthSmallestElementFromArray k = new STO0013_2_FindKthSmallestElementFromArray();

		k.accept();
		k.find();
	}

}