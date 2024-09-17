package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0015_0_ReverseWithoutReverseLastElement 
{
	/*
	 * Input: 1230 
	 * Output: 03210
	 */
	public static void main(String[] args) 
	{
		int n = 1230 ;
		System.out.println("Input: "+n);
		String s = String.format("%05d",n); // to get 1230 to 01230
		//System.out.println ( s ) ;
		int len = s.length ( ) ;
		String rev = "" ;
		for ( int i = len - 1 ; i >= 0 ; i-- )
		{
			rev = rev + s.charAt ( i ) ;
		}
		System.out.println("Output: "+rev); 
	}
}