package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0008_1_ReverseByKeepSpaces 
{
	/**
	 * Input : he is a good boy 
	 * Output: yo bd o ogas ieh
	 */
	public static void main(String[] args) 
	{
		String input = "he is a good boy";
		System.out.println("Input: "+input);

        char[] arr = input.toCharArray();
        char[] result = new char[arr.length];

        // Step 1: mark spaces in result
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ' ') 
            {
                result[i] = ' ';
            }
        }

        // Step 2: reverse characters manually
        int j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] != ' ') 
            {
                while (arr[j] == ' ') 
                {
                    j--;
                }
                result[j] = arr[i];
                j--;
            }
        }
        System.out.print("Output: ");
        // Step 3: print result
        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(result[i]);
        }
	}
}