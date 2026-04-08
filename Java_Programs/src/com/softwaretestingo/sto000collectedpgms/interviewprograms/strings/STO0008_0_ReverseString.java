package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0008_0_ReverseString 
{
	/**
	 * Input : he is a good boy 
	 * Output: yob doog a si eh
	 */
	public static void main(String[] args) 
	{
        String input = "he is a good boy";
        System.out.println("Input: "+input);
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) 
        {
            char ch = input.charAt(i);
            if (ch != ' ') 
            {
                word.append(ch);
            } 
            else
            {
                result.append(word).append(' ');
                word.setLength(0);
            }
        }

        // append last word
        result.append(word);
        System.out.println("Output: " + result);
	}
}