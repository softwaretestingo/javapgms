package com.softwaretestingo.interviewprograms;
import java.util.Arrays;
public class InterviewPrograms25 
{
	/*
	 * Input ( 1,2,3,4,5 ) 
	 * Output- { 3,4,5,1,2 )
	 */
	public static void main(String[] args) 
	{
		int [] a = {1 , 2 , 3 , 4 , 5 };
		System.out.println("Original Array" + Arrays.toString(a));
		int nor = 2 ; // no of Rotations
		for ( int i=0; i<nor; i++ ) 
		{
			int fE = a[0] ; // get First Element
			for(int j=0 ; j<a.length-1; j++ ) 
			{
				a[j]= a[j+1];
			}
			a[a.length-1]=fE ; // put first element at last position
		}
		System.out.println("Array after " + nor + " rotations " + Arrays.toString(a));
	}

}
