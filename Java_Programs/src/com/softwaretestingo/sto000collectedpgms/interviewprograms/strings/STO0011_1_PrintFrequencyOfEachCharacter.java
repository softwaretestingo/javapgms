package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0011_1_PrintFrequencyOfEachCharacter 
{
	/*
	 * Input string =abbcccdeee 
	 * Output= a1b2c3d1e3
	 */
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		String str = "abbcccdeee";
		System.out.println("Input: "+str);
		String[] strArray = str.split("");
		int i = 0 ;
		while ( i < strArray.length ) 
		{
			int counter=0 ;
			int j = i ;
			while ( j < strArray . length ) 
			{
				if ( ! strArray [ i ] .equals ( strArray [ j ] ) )
					break;
				counter++ ;
				j++;
			}
			sb.append ( strArray [ i ] ) . append ( counter ) ;
			i = j ;
		}
		System.out.println ("Output: "+sb.toString());
	}
}