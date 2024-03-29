package com.softwaretestingo.interviewprograms;

/**
 * @author SoftwareTesting.com
 *
 */
public class InterviewPrograms_108_SumOfAllNumOfaStringWithoutUsingRegx 
{
	/*
	 * Write a program that calculate the sum of all numbers present in alphanumeric
	 * string in sentence.
	 * 
	 * Input: "1a b23c de45f" 
	 * Output: 69 (1 + 23 + 45)
	 */
	public static void main(String[] args) 
	{
		String str = "1a b23cd e45f";
		int sum = 0;

		String number = "";
		for (int i = 0; i <=str.length()-1; i++) 
		{
			if (Character.isDigit(str.charAt(i))) 
			{
				number += str.charAt(i);
			} 
			else if (!number.isEmpty()) 
			{
				sum += Integer.parseInt(number);
				number = "";
			}
		}
		System.out.println("Sum Of All Numbers: "+sum);
	}
}