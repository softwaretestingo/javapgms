package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0113_1_InterviewPrograms 
{
	/**
	 * Author: SoftwareTestingo 
	 * Admin Blog: www.softwaretestingo.com Problem
	 * Statement: 
	 * 
	 * Input Value: aaabat
	 * Output: bat
	 *  
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String input = "aaabat";
		System.out.println("Input: "+input);
        String result = removeInitialRepetitiveLetters(input);
        System.out.println("Output: " + result);
	}
	
	public static String removeInitialRepetitiveLetters(String input) 
	{
        if (input == null || input.isEmpty()) 
        {
            return input;
        }

        char firstChar = input.charAt(0);
        int index = 1;

        // Find the first character that is different from the initial character
        while (index < input.length() && input.charAt(index) == firstChar) 
        {
            index++;
        }

        // Return the substring starting from the first non-repetitive character
        return input.substring(index);
    }
}