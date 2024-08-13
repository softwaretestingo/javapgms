package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Collections;
import java.util.stream.Collectors;
public class STO0031_2_InterviewPrograms 
{
	/*
	 * Input string s ="amZgxY" 
	 * Need to print biggest character asiic value.
	 */
	public static void main(String[] args) 
	{
		String str = "amZgxY";

		// Using Stream
		char c = (char)str.chars().max().getAsInt();
		System.out.println ( c ) ;


		// using for each loop
		int max = 0 ;
		for (char char_val : str.toCharArray())
			if ( char_val > max )
				max = char_val ;
		System.out.println ((char)max);


		// Using Collections class
		char c1 = (char)Collections.max(str.chars().boxed().collect(Collectors.toList())).intValue();
		System.out.println(c1);
	}
}