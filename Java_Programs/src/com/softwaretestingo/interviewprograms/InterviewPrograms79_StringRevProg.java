package com.softwaretestingo.interviewprograms;
public class InterviewPrograms79_StringRevProg 
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