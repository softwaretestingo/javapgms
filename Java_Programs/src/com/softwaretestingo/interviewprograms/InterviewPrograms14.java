package com.softwaretestingo.interviewprograms;

public class InterviewPrograms14 
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
		String str= "Selenium";
		// char [ ] chs str.toCharArray ( ) ;
		int len = str.length() , temp = 0 ;
		String out = "";
		for (int k = 0 ; k<len-1; k++) 
		{
			for ( int i = k + 1 ; i < len ; i ++ ) 
			{
				out =out + str.charAt(i);
			}  
			temp= k ;
			while ( k >= 0 ) 
			{
				out= out + str.charAt ( k ) ;
				k -- ;
			}
			k=temp;
			System.out.println ( out ) ; 
			out="";
		}
	}
}