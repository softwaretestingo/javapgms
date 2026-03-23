package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Arrays;
import java.util.stream.Collectors;
public class STO0022_5_RemoveDuplicatesFromStrings 
{
	/**
	 * Original String : Java
	 * After removing the duplicates : Jav
	 * 
	 */
	public static void main(String[] args) 
	{
		String orignalString = "Java";

		String output = Arrays.asList(orignalString.split(""))
				.stream()
				.distinct()
				.collect(Collectors.joining());
		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + output);
	}
}