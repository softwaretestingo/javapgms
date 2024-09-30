package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0039_2_RemoveDuplicatesFromStrings 
{
	public static void main(String[] args) 
	{
		String s="softwaretestingo";
		System.out.println("Input: "+s);
		int count;
		System.out.print("Output: ");
		for (int i = 0; i < s.length(); i++) 
		{
			count =0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(i) == s.charAt(j) && i!=j)
				{
					count++;
					break;
				}
			}
			if(count ==0)  {
				System.out.print(s.charAt(i));
			}
		}
	}
}