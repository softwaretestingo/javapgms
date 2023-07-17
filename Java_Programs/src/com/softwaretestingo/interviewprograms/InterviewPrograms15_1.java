package com.softwaretestingo.interviewprograms;
public class InterviewPrograms15_1 
{
	/*
	 * Input: 01230 
	 * Output: 03210
	 */
	public static void main(String[] args) 
	{
		String s= "01230";
		System.out.println("Input: "+s);
		String newStr = " " ;
		char c [ ] =s.toCharArray ( ) ;         
		for ( int i = c.length - 1 ; i >= 0 ; i-- )
		{
			newStr= newStr + c [ i ] ;
		}
		System.out.println ("Output"+newStr);
	}
}