package com.softwaretestingo.sto000collectedpgms.interviewprograms.numbers;
public class STO0004_1_ReverseNumber 
{	
	/**
	 * Input: SoftwareTestingo
	 * Output: ognitseTerawtfoS
	 * 
	 */
	public static void main(String[] args) 
	{	
		String s="SoftwareTestingo";
		System.out.println("Input: "+s);
		String rev="";
		
		for(int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Output: "+rev);
	}
}