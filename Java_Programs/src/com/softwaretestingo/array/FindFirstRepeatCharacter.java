package com.softwaretestingo.array;
public class FindFirstRepeatCharacter 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the First Repeated Character Of the Array 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
	
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The First Repeated Character is: "+arr[i]);
					System.exit(0);
				}	
			}
		}
	}
}