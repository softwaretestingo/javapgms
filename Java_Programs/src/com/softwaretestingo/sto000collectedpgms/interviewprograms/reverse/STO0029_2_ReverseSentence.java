package com.softwaretestingo.sto000collectedpgms.interviewprograms.reverse;
public class STO0029_2_ReverseSentence 
{
	public static void main(String[] args) 
	{
		String s="Welcome to Softwar Testing Blog", rev="";
		System.out.println("Input: "+s);
		String []sWord=s.split(" ");

		for (int i = sWord.length-1; i >=0; i--) 
		{
			rev=rev+sWord[i]+ " ";
		}
		System.out.println("Output: "+rev);
	}
}