package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0041_0_LetterFollowedByNumberInOriginalOrder 
{
	/*
	 * String input= AB2C99423A 
	 * String output =A2B9C9A423
	 */
	public static void main(String[] args) 
	{
		String s = "AB2C99423A";
		System.out.println("Input: "+s);
		char[] cArr = s.toCharArray();
		char resultArr[] = new char [cArr.length*2];
		int evenCount = 0 ;
		int oddcount = 1 ;
		for ( int i=0 ; i<s.length(); i++ )
		{
			if ( Character.isAlphabetic(cArr[i]))
			{
				resultArr [evenCount] = cArr[i];
				evenCount = evenCount+2;
			} 
			else if(!Character.isAlphabetic(cArr[i]))
			{
				resultArr [oddcount]= cArr[i];
				oddcount = oddcount+2 ;
			}
		}
		System.out.print("Output: ");
		System.out.print(resultArr);
	}
}