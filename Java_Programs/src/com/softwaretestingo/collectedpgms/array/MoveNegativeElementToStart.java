package com.softwaretestingo.collectedpgms.array;

import java.util.Arrays;

public class MoveNegativeElementToStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-1,2,3,-4,-7,8};
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}