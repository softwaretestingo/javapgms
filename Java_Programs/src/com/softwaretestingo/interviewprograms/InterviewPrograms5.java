package com.softwaretestingo.interviewprograms;
public class InterviewPrograms5 
{
	/*
	 * 
	 * Input/Expected Output: 
	 * int[] intArray = {3,8,2,3,3,2}; // Output : 3
	 * int[] intArray1 = {7,1,2,8,2}; // Output : 2 
	 * int[] intArray2 = {3,1,4,1,5}; // Output : 0 
	 * int[] intArray3 = {5,5,5,5,5,5}; // Output : 0
	 * int[] intArray4 = {5,5,5,5,5}; // Output : 5
	 * NotWorking
	 */	
	public static void main(String[] args) 
	{
		int [] ar = {3,8,2,3,3,2};
		int [] ar1 = {7,1,2,8,2};
		int [] ar2 = {3,1,4,1,5};
		int [] ar3 = {5,5,5,5,5,5};
		int [] ar4 = {5,5,5,5,5};
		System.out.println(validate(ar));
		System.out.println(validate(ar1));
		System.out.println(validate(ar2));
		System.out.println(validate(ar3));
		System.out.println(validate(ar4));
	}
	public static int validate (int arf[]) 
	{

		int bigNumb = 0 ;
		int count = 0 ;
		for ( int i = 0 ; i <arf.length ; i ++ ) 
		{
			for ( int j= 0 ; j <arf.length ; j ++ ) 
			{
				if ( arf [ i ] == arf[j] ) 
				{
					count ++ ;
				}
			}
			if ( count == arf [ i ] && bigNumb < arf [ i ] ) 
			{
				bigNumb = arf [ i ] ;
				count = 0 ; 
			}
		}
		return bigNumb;
	}
}