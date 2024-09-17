package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0059_1_ReverseNumber 
{	
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