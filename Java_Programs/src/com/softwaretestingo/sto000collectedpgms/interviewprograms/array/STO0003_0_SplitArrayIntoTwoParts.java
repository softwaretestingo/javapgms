package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;

import java.io.UnsupportedEncodingException;
import java.util.*;

public class STO0003_0_SplitArrayIntoTwoParts 
{
   public static void main(String[] args) throws UnsupportedEncodingException 
   {
	   int arr[]= {1,2,3,4,5};
	   int size=(arr.length)/2;
	   int arr1[]=new int[size];
	   int arr2[]=new int[arr.length-size];
	   //System.out.println(arr1.length);
	   //System.out.println(arr2.length);
	   System.out.println("Mid Of Array: "+size);
	   for(int i=0;i<arr.length;i++)
	   {
		   if(i<size)
		   arr1[i]=arr[i];
		   else if(i>=size)
		   {
			   int j=i-size;
			   System.out.println(j);
			   arr2[j]=arr[i];
		   }
	   }
	   System.out.println("-------------------------");
	   System.out.println(Arrays.toString(arr1));
	   System.out.println(Arrays.toString(arr2));
	   
   }
}