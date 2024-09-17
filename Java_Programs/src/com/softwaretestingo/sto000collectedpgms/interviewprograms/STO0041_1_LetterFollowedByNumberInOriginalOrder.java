package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0041_1_LetterFollowedByNumberInOriginalOrder 
{
	/*
	 * String input= AB2C99423A 
	 * String output =A2B9C9A423
	 */
	public static void main(String[] args) 
	{
		String inpu = "AB2C99423A";
		System.out.println("Input: "+inpu);
		String charac = "";
		String intege = "";
		String result="";
		for(int i=0;i<inpu.length();i++) 
		{
			if(Character.isLetter(inpu.charAt(i))) 
			{
				charac = charac + inpu.charAt(i);
			}
			else if(Character.isDigit(inpu.charAt(i))) 
			{
				intege = intege + inpu.charAt(i);
			}
		}
		int index1=0, index2=0;
		for(int i=0;i<inpu.length();i++) 
		{
			if(i%2==0 && charac.length()>index1) 
			{
				result = result + charac.charAt(index1);
				index1++;
			}
			else 
			{
				if(intege.length()>index2)
				{
					result = result + intege.charAt(index2);
					index2++;
				}
			}
		}
		System.out.println("Output: "+result);
	}
}