package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0120_2_PrintDuplicateCharactersWithCount 
{
	public static void main(String[] args) 
	{
		// input string
		String string = "softwaretestingo";
		System. out.println("The string is: " + string);

		// covert the string to the char array
		char s[] = string.toCharArray();
		int i = 0;
		// Traverse the string from left to right
		System.out.print("The duplicate characters in the string are: ");
		for (i = 0; i < s.length; i++)
		{
			// For each character count the frequency
			int count = 1;
			// s[i] == '0' means we have already visited this character so no need to count its frequency again.
			if (s[i] == '0')
				continue;
			int j = i + 1;
			for (j = i + 1; j < s.length; j++) 
			{
				// If a match found increase the count by 1
				if (s[i] == s[j]) {
					count++;
					s[j] = '0';
				}
			}

			// If count is more than one then print it
			if (count > 1) 
			{
				System.out.print(s[i] + " ");
			}
		}
	}
}