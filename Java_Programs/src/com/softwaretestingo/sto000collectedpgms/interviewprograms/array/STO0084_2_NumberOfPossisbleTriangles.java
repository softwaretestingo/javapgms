package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class STO0084_2_NumberOfPossisbleTriangles 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size Of The Array: ");
		//no. of elements in array
		int n = Integer.parseInt(br.readLine());

		int[] sides = new int[n];
		String[] input;

		// Split Numbers Based On the Spaces
		System.out.println("Enter the "+n +" Integers");
		//input = br.readLine().split(" ");

		for(int i=0; i<n; i++)
		{
			sides[i] = Integer.parseInt(br.readLine());
		}

		// Sort the array elements in non-decreasing order
		Arrays.sort(sides);
		boolean flag = false;

		//starting from end, because we have sorted in 
		//ascending order and we want the max element 
		//first, you could also sort in descending order 
		//and start from i=0

		for(int i=n-1; i>=2; i--)
		{
			if(sides[i-2]+sides[i-1]>sides[i])
			{
				System.out.println(sides[i-2]+" "+sides[i-1]+" "+sides[i]);
				flag = true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("-1");
		}
	}

}