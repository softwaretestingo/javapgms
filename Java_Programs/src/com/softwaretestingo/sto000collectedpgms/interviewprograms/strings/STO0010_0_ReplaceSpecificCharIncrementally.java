package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0010_0_ReplaceSpecificCharIncrementally 
{
	/**
	 * Input: tomorrow 
	 * Output: t#m##rr###w
	 */
	public static void main(String[] args) 
	{
		String input = "tomorrow";
		System.out.println("Input: "+input);
        char target = 'o';

        int hashCount = 1;

        // Traverse each character manually
        System.out.print("Output: ");
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (ch == target) 
            {
                // Print incremental #
                for (int j = 0; j < hashCount; j++) 
                {
                    System.out.print("#");
                }
                hashCount++;
            }
            else
            {
                System.out.print(ch);
            }
        }
	}
}