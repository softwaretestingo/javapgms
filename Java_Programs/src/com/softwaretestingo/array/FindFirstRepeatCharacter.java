package com.softwaretestingo.array;

public class FindFirstRepeatCharacter {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					System.exit(0);
				}
				
			}
		}

	}

}
