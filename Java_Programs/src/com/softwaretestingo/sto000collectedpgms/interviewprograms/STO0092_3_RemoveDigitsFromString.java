package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0092_3_RemoveDigitsFromString 
{
	/**
	 * Write Java code to remove trailing spaces from string
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int i=0, j=0, k=0;
		String str="                    This is a String  ";
		System.out.println("Original String is: "+str);
		
		for(i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(!Character.isWhitespace(ch))
			{
				System.out.println("First Character Occurance Character Is: "+ str.charAt(i));
				j=i;
				break;
			}
		}
		
		for(i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			if(!Character.isWhitespace(ch))
			{
				System.out.println("Last Character Occurance Is: "+str.charAt(i));
				k=i;
				break;
			}
		}
		
		System.out.print("The Truncated String is: ");
		for(i=j; i<=k; i++)
		{
			System.out.print(str.charAt(i));
		}

	}

}
