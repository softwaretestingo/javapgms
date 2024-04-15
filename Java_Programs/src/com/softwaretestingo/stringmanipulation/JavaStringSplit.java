package com.softwaretestingo.stringmanipulation;
import java.util.Arrays;
public class JavaStringSplit 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split the String
	 * 
	 */
	public static void main(String[] args) 
	{
		String line = "I am a java developer";
		String[] words = line.split(" ");
		String[] twoWords = line.split(" ", 2);

		System.out.println("String split with delimiter: " + Arrays.toString(words));
		System.out.println("String split into two: " + Arrays.toString(twoWords));

		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";
		String[] numbers = wordsWithNumbers.split("\\|");
		System.out.println("String split with special character: " + Arrays.toString(numbers));
	}
}