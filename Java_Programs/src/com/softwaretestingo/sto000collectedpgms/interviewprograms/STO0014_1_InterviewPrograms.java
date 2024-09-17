package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0014_1_InterviewPrograms 
{
	/*
	 * Input="Selenium" 
	 * Output: 
	 * eleniumS
	 * leniumeS
	 * eniumleS
	 * niumeleS
	 * iumneleS
	 * umineleS
	 * muineleS
	 */

	public static void main(String[] args) 
	{
		String str = "Selenium";
		System.out.println("Input: "+str);
		char [ ] input = str.toCharArray();
		int len = input.length ;
		printArr(input, len);
	}

	public static void printArr (char[] input, int len) 
	{
		System.out.println("Output: ");
		for (int i = 0 ; i<input.length ; i++ ) 
		{
			char temp = input[0];
			for ( int j = 1 ; j < len ; j ++ )
			{
				input[j-1]=input[j];
			}
			input[len-1]=temp;
			len--;
			System.out.println(input);
		}
	}
}