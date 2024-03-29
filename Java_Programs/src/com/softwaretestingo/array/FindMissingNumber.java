package com.softwaretestingo.array;

public class FindMissingNumber {

	public static void main(String[] args) 
	{
		 int[] arr = { 1, 2, 4,3, 5,7 };
		 int size=arr.length;
		 int sum = ((size + 1) * (size + 2)) / 2;
		 for(int i=0;i<size;i++)
		 {
			 sum -= arr[i];
		 }
		System.out.println(sum);

	}

}
