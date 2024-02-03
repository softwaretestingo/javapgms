package com.softwaretestingo.interviewprograms;
public class InterviewPrograms_102_StringVowelsCountUsingRecursion 
{
	public static void main(String[] args) 
	{
		String str = "Welcome To SoftwareTestingo";

		str = str.toLowerCase();

		System.out.println("Total number of vowels in string are:");
		System.out.println(vowelno(str, str.length()));
	}

	// isVowel() function returns 1 if the
	// character is a vowel and 0 if it is not
	static int isVowel(char chars)
	{
		if (chars == 'a' || chars == 'e' || chars == 'i'
				|| chars == 'o' || chars == 'u') {
			return 1;
		}
		else {
			return 0;
		}
	}

	// recursive function to return the number
	// of characters in a string
	static int vowelno(String str, int l)
	{
		if (l == 1) {
			return isVowel(str.charAt(l - 1));
		}

		return vowelno(str, l - 1)
				+ isVowel(str.charAt(l - 1));
	}
}