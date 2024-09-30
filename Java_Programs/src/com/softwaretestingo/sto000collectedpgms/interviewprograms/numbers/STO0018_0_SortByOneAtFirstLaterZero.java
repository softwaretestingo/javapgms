package com.softwaretestingo.sto000collectedpgms.interviewprograms.numbers;

import java.util.Arrays;

public class STO0018_0_SortByOneAtFirstLaterZero 
{
	/*
	 * Input 11001101011 
	 * Output 1111100000 (first numeric 1 and followed by 0s)
	 */
	public static void main ( String args [ ] ) 
	{
		int arr [ ] = { 1,1,0,0,1,1,0,1,0,1,1 };
		System.out.println("Input: "+Arrays.toString(arr));
		int i = 0 , j = 0 ;

		while ( i < arr.length ) 
		{
			if ( arr [ i ] == 1 ) 
			{
				swap ( arr , i , j ) ;
				i ++ ;
				j ++ ;
			}
			else 
			{
				i ++ ;
			}
		}
		System.out.print("Output: ");
		for ( int k = 0 ; k < arr.length ; k ++ )
			System.out.print ( arr [ k ] ) ;
	}
	private static void swap ( int [ ] arr , int i , int j )
	{                                          
		int temp=arr[i] ;;
		arr [i]= arr [j] ;
		arr [j] = temp ;
	}
}