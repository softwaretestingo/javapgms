package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;

public class STO0009_1_RunLengthEncoding 
{
	/**
	 * Input: AAAABBCCCDDDDEEEG
	 * Output: A4B2C3D4E3G1
	 * 
	 */
	public static void main(String[] args) 
	{
        String input = "AAAABBCCCDDDDEEEG";
        System.out.println("Input: "+input);
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++)
        {
            if (input.charAt(i) == input.charAt(i - 1)) 
            {
                count++;
            } 
            else 
            {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // append last character and its count
        result.append(input.charAt(input.length() - 1)).append(count);
        System.out.println("Output: "+result.toString());
	}
}