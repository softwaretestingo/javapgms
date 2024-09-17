package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0033_0_ReplaceWithNextElementOfArray 
{
	/*
	 * Input array- {1,2,3,4,5} 
	 * Output array- {2,1,4,3,5}
	 */
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		System.out.println("Input: "+Arrays.toString(arr));
		int tmp=0;
		for(int i =1;i<arr.length;i+=2)
		{
			tmp=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=tmp;
		}
		System.out.print("Output: ");
		for(int i:arr)
			System.out.print(i);
	}
}