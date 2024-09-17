package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0021_3_MovingAllZerosToBeginning 
{
	/*
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 */
	public static void main(String[] args) 
	{
		int [] givenArray = { 5 , 0 , 4 , 6 , 0 , 7 , 0 };
		System.out.println("Input: "+Arrays.toString(givenArray));
		//reqArray [] = { 0,0,0,5,4,6,7 };
		int reqArray [] = new int[givenArray.length];
		int reqArrayIndex = 0 ;

		// to add zeroes in the beginning
		for (int j=0; j<givenArray.length ; j++ ) 
		{
			if (givenArray[j]==0) 
			{
				reqArray[reqArrayIndex]=0;
				reqArrayIndex++ ;
			}
		}
		// to add digits without changing order
		for ( int l=0 ; l<givenArray.length; l++ )
		{
			if (givenArray[l]!=0) 
			{
				reqArray[reqArrayIndex]=givenArray[l];
				reqArrayIndex++;
			}       
		}
		System.out.print("Output: ");
		for ( int arr=0; arr<reqArray.length; arr++ ) 
		{
			System.out.print(reqArray[arr]+" ");
		}
	}
}