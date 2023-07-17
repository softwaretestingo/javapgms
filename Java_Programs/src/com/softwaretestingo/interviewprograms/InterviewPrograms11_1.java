package com.softwaretestingo.interviewprograms;

public class InterviewPrograms11_1 
{
	/*
	 * Input string =AAAADDDCCCA 
	 * Output= A4D3C3A1
	 */
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		String str = "AAAADDDCCCA";
		String[] strArray = str.split("");
		int i = 0 ;
		while ( i < strArray.length ) 
		{
			int counter=0 ;
			int j = i ;
			while ( j < strArray . length ) 
			{
				if ( ! strArray [ i ] .equals ( strArray [ j ] ) )
					break;
				counter++ ;
				j++;
			}
			sb.append ( strArray [ i ] ) . append ( counter ) ;
			i = j ;
		}
		System.out.println (sb.toString());
	}
}