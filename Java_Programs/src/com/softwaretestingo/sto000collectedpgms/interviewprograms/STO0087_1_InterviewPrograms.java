package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0087_1_InterviewPrograms 
{
	static int findLongSubstr(String str)
	{
		// Stores Longest Palindrome Substring
		String longest = "";
		int n = str.length();
		int j;

		// To store substring which we think can be a palindrome
		String subs = "";

		// To store reverse of substring we think can be palindrome
		String subsrev = "";
		for (int i = 0; i < n; i++) 
		{
			j = n - 1;
			while (i < j) 
			{

				// Checking whether the character at i and j
				// are same.
				// If they are same then that substring can be LPS
				if (str.charAt(i) == str.charAt(j)
						&& longest.length() < (j - i + 1)) 
				{
					subs = str.substring(i, j + 1);
					subsrev = new StringBuilder(subs).reverse().toString();
					if (subs.equals(subsrev)) 
					{
						longest = subs;
					}
				}
				j--;
			}
		}

		// If no longest substring then we will return first
		// character
		if (longest.length() == 0) {
			longest = str.substring(0, 1);
		}
		System.out.println(
				"Longest palindrome substring is: " + longest);

		// Return length of LPS
		return longest.length();
	}
	public static void main(String[] args)
	{
		String str = "abcdcbe";
		System.out.print("\nLength is: "+ findLongSubstr(str));
	}
}