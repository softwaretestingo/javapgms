package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class STO0028_1_ReverseStringWithOutReverseDigitsAndSpecialCharacters 
{
	/*
	 * Input String // My n@me is 12Rahul 
	 * Output String // yM em@n si 12luhaR 
	 * Only charcters should be Character, special characters and numbers should be displayed as it is.
	 */
	public static void main(String[] args) 
	{
		String str = "My n@me is 12Rahul";
		System.out.println("Input: "+str);
		String resultString = Stream.of(str.split(" ")).map(String::toCharArray).map(STO0028_1_ReverseStringWithOutReverseDigitsAndSpecialCharacters::reverse)
				.collect(Collectors.joining(" "));
		System.out.println("Output: "+resultString);
	}
	public static String reverse ( char str [ ] )
	{
		int left = 0 , right = str.length - 1 ;
		while ( left< right ) 
		{
			// Ignore numbers characters
			if ( Character.isDigit ( str [left]))
				left ++ ;
			else if ( Character.isDigit ( str [right]))
				right-- ;
			else {
				char tmp = str [ left ] ;
				str [ left ] = str [ right ] ;
				str [ right ] = tmp ;
				left ++ ;
				right-- ;
			}
		}
		return new String ( str ) ;
	}
}