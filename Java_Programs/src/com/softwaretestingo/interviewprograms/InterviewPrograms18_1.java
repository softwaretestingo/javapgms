package com.softwaretestingo.interviewprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class InterviewPrograms18_1 
{
	/*
	 * Input 11001101011 
	 * Output 1111100000 (first numeric 1 and followed by 0s)
	 */
	public static void main ( String args [ ] ) 
	{
		int arr[] = { 1 , 1 , 0 , 0 , 1 , 1 , 0 , 1 , 0 , 1 , 1 , 0 , 0 , 1 } ;
		HashMap< Integer , Integer > h = new LinkedHashMap<>();
		for ( int i = 0 ; i < arr.length ; i ++ ) 
		{
			h.put(arr[i] , h.getOrDefault(arr[i] , 0 ) + 1);
		}
		int reset = 0 ;
		for ( int x : h.values()) 
		{
			for ( int i = 1 ; i <= x ; i ++ ) 
			{
				if ( reset == 0 )
					System.out.print("1");
				else
					System.out.print("0");
			}
			reset = 1 ;
		}
	}
}