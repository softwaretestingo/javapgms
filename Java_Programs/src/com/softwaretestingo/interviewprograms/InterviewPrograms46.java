package com.softwaretestingo.interviewprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewPrograms46 
{
	/*
	 * 1. Find Sum of numbers in given strings. 
	 * Input : "Welcome[21], Java1How are you78" 
	 * OutPut : 100 [21+1+78]
	 * 
	 * 2. Find Sum of digits in given strings. 
	 * Input : "Welcome[21], Java1How are you78" 
	 * OutPut : 19 [2+1+1+7+8]
	 */
	public static void main(String[] args) 
	{
		InterviewPrograms46 main = new InterviewPrograms46();
		String testData = "Welcome[21], Java1How are you78";
		List<Integer> integers = main.getIntegers(testData);
		System.out.println("Sum of numbers : " + integers.stream().reduce(0, (n1, n2) -> n1 + n2));
		System.out.println("Sum of digits of numbers : " + integers.stream().filter(num->num>0).map(num -> main.sumOfDigits(num)).reduce(0, (n1, n2) -> n1 + n2));
	}

	private Integer sumOfDigits(Integer number)
	{
		int sum = 0;
		while (number > 0)
		{
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}


	private List<Integer> getIntegers(String testData) 
	{
		return Arrays.asList(testData.split(" ")).stream().map(word -> getNumber(word)).collect(Collectors.toList());
	}

	private Integer getNumber(String data) 
	{
		String num = "";
		try 
		{
			for (Character ch : data.toCharArray())
			{
				if (Character.isDigit(ch)) num += String.valueOf(ch);
			}
		} 
		catch (Exception ex) 
		{
			return 0;
		}
		return num.length() > 0 ? Integer.parseInt(num) : 0;
	}
}