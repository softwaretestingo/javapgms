package com.softwaretestingo.interviewprograms;
public class InterviewPrograms20_1 
{
	// Interview Questions Asked In Unify technologies
	// Suppose input string is "c3d4a2" then output should be "cccddddaa"
	public static void main(String[] args) 
	{
		String s="c3d4a2";
		String ans="";

		for (int i = 0; i<=s.length()-1; i++) 
		{
			String r=String.valueOf(s.charAt(i));
			int rep= Integer.valueOf(String.valueOf(s.charAt(i+1)));		

			for (int j =1 ; j<=rep; j++) 
			{
				ans=ans+r;
			}
			i=i+1;
		}
		System.out.println("The Inputted Parameter Is: "+s);
		System.out.print("Expected output Is: "+ans);
	}
}