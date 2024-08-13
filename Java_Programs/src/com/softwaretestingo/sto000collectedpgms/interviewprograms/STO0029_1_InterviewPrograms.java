package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0029_1_InterviewPrograms 
{
	/*
	 * Input - Hi I am Naveen I need and answer 
	 * Output - answer and deen I Naveen ma I Hi
	 */
	public static void main(String[] args) 
	{
		String input = "Hi I am Naveen i need and answer";
		String[] inputArr=input.split(" ");
		String outputStr = "" ;
		int j = 0 ;
		for (int i=inputArr.length-1; i>=0 ; i-- ) 
		{
			++ j ;
			String indexedStr = "";
			if (j%3==0)
			{
				for (int k=inputArr[i].length()-1 ; k>=0 ; k--) 
				{
					indexedStr = indexedStr + inputArr[i].charAt(k);
				}
			}
			else 
			{
				indexedStr=inputArr[i];
			}
			outputStr = outputStr + " " + indexedStr;
		}
		System.out.println(outputStr.trim());
	}
}