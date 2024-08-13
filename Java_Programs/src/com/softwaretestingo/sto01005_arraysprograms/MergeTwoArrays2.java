package com.softwaretestingo.sto01005_arraysprograms;

import java.util.Arrays;

public class MergeTwoArrays2 {

	public static void main(String[] args) 
	{
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		int size1=arr1.length;
		int size2=arr2.length;
		int size=size1+size2;
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			if(i<size1)
			{
				arr[i]=arr1[i];
			}
			else
			{
				int k=size-size1;
				for(int l=0;l<arr2.length;l++)
				{
				arr[k]=arr2[l];
				k++;
				}
			}
		}
		System.out.println(Arrays.toString(arr));	

	}

}
