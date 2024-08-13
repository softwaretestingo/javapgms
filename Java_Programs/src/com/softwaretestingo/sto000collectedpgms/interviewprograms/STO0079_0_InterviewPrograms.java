package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0079_0_InterviewPrograms 
{	
	public static void main(String[] args) 
	{	
		String s="SoftwareTestingo";
		String rev="";
		
		for(int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}