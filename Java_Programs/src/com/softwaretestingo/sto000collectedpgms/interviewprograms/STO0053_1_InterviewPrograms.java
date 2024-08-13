package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0053_1_InterviewPrograms
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
		int input1 = 38;
		int input2 = 1485631;
		int input3 = 0;
		System.out.println(input1+": "+add(input1));
		System.out.println(input2+": "+add(input2));
		System.out.println(input3+": "+add(input3));
	}
	public static int add(int num) 
	{
		//variable to store sum of digits  
		int sum = 0;  
		//loop to do sum while sum is not less than or equal to 9  
		while (num > 0 || sum > 9)  
		{  
			if (num == 0)   
			{  
				num = sum;  
				sum = 0;  
			}  
			//determines the last digit of the number and add that digit to the sum variable   
			sum = sum + num % 10;  
			//remove the last digit of the number  
			num = num / 10;  
		}  
		//returns the number   
		return sum;  
	}
}