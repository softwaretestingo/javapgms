package com.softwaretestingo.array;

public class FindHighestNumberWhichisGreaterThenItsNeighbour 
{
	/*
	 * Problem Statement 
	 * Input: array[]= {5, 10, 20, 15} 
	 * Output: 20
	 */
	public static void main(String[] args) 
	{
		int arr[]={5, 10, 20, 15} ;
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1] )
			{
				System.out.println(arr[i]);
			}
		}

	}

}
