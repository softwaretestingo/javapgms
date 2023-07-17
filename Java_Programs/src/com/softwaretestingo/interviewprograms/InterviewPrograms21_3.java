package com.softwaretestingo.interviewprograms;
public class InterviewPrograms21_3 
{
	/*
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 */
	public static void main(String[] args) 
	{
		int [] givenArray = { 5 , 0 , 4 , 6 , 0 , 7 , 0 };
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
		for ( int arr=0; arr<reqArray.length; arr++ ) 
		{
			System.out.print(reqArray[arr]+" ");
		}
	}
}