package com.softwaretestingo.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class TakeInputAndDisplayArrayValuesEx 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Size Of The Array: ");
		int num=Integer.parseInt(br.readLine());

		int marks[]=new int[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Marks: ");
			marks[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("All the Values are : ");
		for(int i=0;i<num;i++)
		{
			System.out.println(marks[i]);
		}		
	}
}