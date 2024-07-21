package com.softwaretestingo.array;
import java.util.Arrays;
public class MoveAllMinusValuesLeft 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Move all the Minus Values to Starting Of the Array
	 * 
	 */
	public static void main(String[] args) 
	{
		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11 }; 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}