package com.softwaretestingo.array;
public class FindFirstNonRepeatCharacter 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the First Non repeat Character From an Array
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int arr[] = { 9, 4, 9, 6, 7, 4 };
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[i]==arr[j] && i!= j )
				{
					break;
				}
				if(j==size-1)
				{
					System.out.println("The First Non Repeat Character Is: "+arr[i]);
					System.exit(0);;
				}							
			}	
		}
	}
}