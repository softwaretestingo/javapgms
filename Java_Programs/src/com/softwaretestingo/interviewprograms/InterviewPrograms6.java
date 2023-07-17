package com.softwaretestingo.interviewprograms;
public class InterviewPrograms6 
{
	public static void main(String[] args) 
	{
		String input = "Welcome to Mis2is2ip2i Bla4k Adam";
		System.out.println("Input: "+input);
		StringBuilder res = new StringBuilder();
		for ( int i = 0 ; i <input.length(); i ++ ) 
		{
			char currentCharacter = input.charAt(i);
			if ( Character.isDigit (currentCharacter))
			{
				int count = Character.getNumericValue (currentCharacter) ;
				char charToAppend = input.charAt (i-1);
				while (count -- >1) 
				{
					res.append (charToAppend);
				}
			}
			else
			{
				res.append (currentCharacter);
			}
		}
		System.out.println("Output:"+res);
	}
}