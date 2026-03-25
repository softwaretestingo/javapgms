package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class STO0003_0_SplitArrayHalf 
{
	/**
	 * Mid Element No In The Array: 3
	 * [1, 2, 3]
	 * [4, 5, 6]
	 * 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException 
	{
	   int arr[]= {1,2,3,4,5,6};
	   int size=(arr.length)/2;
	   int arr1[]=new int[size];
	   int arr2[]=new int[arr.length-size];
	   System.out.println("Mid Element No In The Array: "+size);
	   for(int i=0;i<arr.length;i++)
	   {
		   if(i<size)
		   arr1[i]=arr[i];
		   else if(i>=size)
		   {
			   int j=i-size;
			   arr2[j]=arr[i];
		   }
	}
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));   
   }
}