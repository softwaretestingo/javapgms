package com.softwaretestingo.interviewprograms;

import java.util.Scanner;

public class InterviewPrograms88_1 
{
	public static void main(String[] args)
	{
		int row, i, j,k,l, space;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for rows: ");
		row = in.nextInt();

		int ncr[][] = new int[row][row];

		//First element is always 1
		ncr[0][0] = 1;  

		//start from 2nd row i.e from i=1
		for(i=1; i<row; i++)
		{
			//First element of each row is always 1
			ncr[i][0] = 1; 
			for(j=1; j<=i; j++)
			{
				ncr[i][j] = ncr[i-1][j-1] + ncr[i-1][j];
			}
		}
		//Output the array
		for(i=0; i<row; i++)
		{
			//Output the blank space
			for(k=0; k<row-i; k++)
			{
				System.out.print(" ");
			}
			for(j=0; j<=i; j++)
			{
				System.out.print(ncr[i][j]+" ");
			}
			System.out.println();
		}
	}
}