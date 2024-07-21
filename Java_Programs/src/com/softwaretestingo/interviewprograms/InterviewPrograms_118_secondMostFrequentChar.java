package com.softwaretestingo.interviewprograms;
import java.util.HashMap;
import java.util.Map;
public class InterviewPrograms_118_secondMostFrequentChar {
	/**
	 * Write Java code for second Most Frequent Character 
	 * Input: aabbbcddeeee
	 * Output: bbbb
	 */
	public static void main(String[] args) 
	{
		String s = "aaabbbbcddeeeee";
		System.out.println("Input String: "+s);
		System.out.println("Second Most Frequent Character: "+secondMostFrequentChar(s));
	}

	public static String secondMostFrequentChar(String s) 
	{
		Map<Character, Integer> freq = new HashMap<>();
		for (char c : s.toCharArray()) 
		{
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		char maxChar = ' ';
		char secondMaxChar = ' ';
		int maxCount = 0;
		int secondMaxCount = 0;

		for (Map.Entry<Character, Integer> entry : freq.entrySet()) 
		{
			if (entry.getValue() > maxCount) 
			{
				secondMaxCount = maxCount;
				secondMaxChar = maxChar;
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
			else if (entry.getValue() > secondMaxCount) 
			{
				secondMaxCount = entry.getValue();
				secondMaxChar = entry.getKey();
			}
		}

		return String.valueOf(secondMaxChar).repeat(secondMaxCount);
	}
}