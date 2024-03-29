package com.softwaretestingo.array;

public class FindFirstNonRepeatCharacter {

	public static void main(String[] args) {
		int arr[] = { 9, 4, 9, 6, 7, 4 };
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[i]==arr[j] && i!= j )
				{
					System.out.println(arr[i] + "Element Found");
					break;
				}
				if(j==size-1)
				{
					System.out.println(arr[i]);
					System.exit(0);;
				}
										
			}
			
		}

	}

}
