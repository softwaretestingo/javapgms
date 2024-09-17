package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0003_5_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";

		int count = 0, lastIndex = 0;
		while((lastIndex = str.indexOf(findStr, lastIndex)) != -1) 
		{
			lastIndex += findStr.length() - 1;
			count++;
		}
		System.out.println("Original String: "+str);
		System.out.println("Sub String: "+findStr);
		System.out.println("Total Number Of Substring Appears: "+count);
	}
}