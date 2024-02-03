package com.softwaretestingo.interviewprograms;
import java.util.ArrayList;
public class InterviewPrograms_102_StringVowelsCountUsingArrayListContains 
{
	public static void main(String[] args) 
	{
		String str = "www.softwaretestingo.com";
		str = str.toLowerCase();
		int count = 0;
		String vow ="aeiou";
		ArrayList<Character> vowels = new ArrayList<Character>();
		for(int i=0;i<vow.length();i++)
		{
			vowels.add(vow.charAt(i));
		}
		for (int i = 0; i < str.length(); i++) {
			if(vowels.contains(str.charAt(i))){
				count++;
			}
		}

		// display total count of vowels in string
		System.out.println("Total no of vowels in string are: " + count);
	}
}