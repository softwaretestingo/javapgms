package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
public class STO0025_0_InterviewPrograms 
{
	/*
	 * Input ( 1,2,3,4,5 ) 
	 * Output- { 3,4,5,1,2 )
	 */
	public static void main(String[] args) 
	{
		int [] a = {1 , 2 , 3 , 4 , 5 };
		System.out.println("Input: " + Arrays.toString(a));
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
		System.out.println("Output: "+"Array after " + nor + " rotations " + Arrays.toString(a));
	}

}
