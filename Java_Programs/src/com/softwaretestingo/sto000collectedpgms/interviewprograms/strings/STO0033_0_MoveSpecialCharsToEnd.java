package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0033_0_MoveSpecialCharsToEnd 
{	
	public static void main(String[] args) 
	{	
		/**
		 * Input: !I a#m S@ou$%^ra@v
		 * Output: I am Sourav!#@$%@
		 */
		
		String s="!I a#m S@ou$%^ra@v";
		System.out.println("Input: "+s);
		String spl=s.replaceAll("[a-zA-z0-9 ]+","");
		String spl1=s.replaceAll("[$&+^,:;=?@#|'<>*()%!]+","");
		//System.out.println(spl);
		System.out.println("Output: "+spl1+spl);	
	}
}