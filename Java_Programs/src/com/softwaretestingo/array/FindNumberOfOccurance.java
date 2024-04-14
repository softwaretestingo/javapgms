package com.softwaretestingo.array;
import java.util.Scanner;
public class FindNumberOfOccurance 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: From the Array Find the entered Value is present once or more then once
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
		int result=0;
		System.out.println("Which Character Count You Want?, Enter The Character: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int duplicatevalue=0;
		for(int i=0; i<arr.length;i++ )
		{
			if(arr[i]==no)
				result++;
			if(result>=2)
			{
				duplicatevalue=arr[i];
				// Once we find a duplicate, no need to continue looping
				break;
			}
		}
		
		if(duplicatevalue!=0)
		{
			System.out.println(duplicatevalue + " Is Present More Then Once");
		}
		else
			System.out.println(no +" is Present only Once");	
	}
}