package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0100_0_InterviewPrograms 
{
	/*
	 * Given a string and return the string after replacing every uppercase letter
	 * with the same lowercase letter. Input : s = "Hello Interview Is Going On Now"
	 * Output : "hello interview is going on now"
	 */

	//This Questions Asked in Cigniti technologies
	public static void main(String[] args) 
	{
		String s= "Hello Interview Is Going On Now";
		char[]c = s.toCharArray();

		for(int i=0;i<c.length;++i )
		{
			if(c[i]>=65 && c[i]<=90)
			{
				c[i] = (char)  (c[i] + 32);
			}
		}
		System.out.println("Original String: "+s);
		System.out.println("After Converting: "+String.valueOf(c));
	}

}
