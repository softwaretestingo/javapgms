package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0113_0_InterviewPrograms 
{
	/**
	 * Author: SoftwareTestingo Admin 
	 * Blog: www.softwaretestingo.com Problem
	 * Statement: Move the even position element First and Then Odd Number Elements
	 * 
	 * Input: [3 2 5 6]
	 * Output:[2 6 3 5]
	 * 
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 */
	public static void main(String[] args) 
	{
		int[] input = { 3, 2, 5, 6 };
		int[] output = rearrangeArray(input);
		System.out.println("Input: "+Arrays.toString(input));
		System.out.println("Output: "+Arrays.toString(output));
	}

	public static int[] rearrangeArray(int[] input) 
	{
		 Arrays.sort(input);
		 int[] output = new int[input.length];
		 int left = 0;
		 int right = input.length - 1;
		 for (int i = 0; i < input.length; i++) 
		 {
		 if (i % 2 == 0) 
		 {
			 output[i] = input[right];
			 right--;
		 }
		 else
		 {
			 output[i] = input[left];
			 left++;
		 }
		 }
		return output;
	}
}