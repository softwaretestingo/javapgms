package com.softwaretestingo.interviewprograms;
public class InterviewPrograms14_1 
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
		char [ ] input = str.toCharArray();
		int len = input.length ;
		printArr(input, len);
	}

	public static void printArr (char[] input, int len) 
	{
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