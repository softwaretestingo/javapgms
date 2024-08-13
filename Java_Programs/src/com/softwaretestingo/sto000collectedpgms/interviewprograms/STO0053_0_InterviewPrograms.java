package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
import java.util.stream.IntStream;
public class STO0053_0_InterviewPrograms
{
	/*
	 * Given an integer num, repeatedly add all its digits until the result has only
	 * one digit, and return it.
	 * 
	 * Example 1:
	 * Input: num = 38
	 * Output: 2
	 * 
	 * Explanation: The process is
	 * 38 --> 3 + 8 --> 11
	 * 11 --> 1 + 1 --> 2 
	 * Since 2 has only one digit, return it.
	 * Example 2:
	 * Input: num = 0
	 * Output: 0
	 */

	public static void main(String[] args) 
	{
		String input1 = "38";
		String input2 = "1485631";
		String input3 = "0";
		System.out.println(input1+": "+add(input1));
		System.out.println(input2+": "+add(input2));
		System.out.println(input3+": "+add(input3));
	}
	public static int add(String input) 
	{
		int[] array = Arrays.asList(input.split("")).stream().mapToInt(Integer::parseInt).toArray();
		int sum = IntStream.of(array).sum();
		if (sum / 10 == 0)
		{
			return sum;
		} 
		else 
		{
			return add(String.valueOf(sum));
		}
	}
}