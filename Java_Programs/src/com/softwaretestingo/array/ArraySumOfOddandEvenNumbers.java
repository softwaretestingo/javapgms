package com.softwaretestingo.array;
public class ArraySumOfOddandEvenNumbers 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: From the array Find the Sum Of All Odd Number & Even Numbers 
	 * 
	 */
	public static void main(String[] args) 
	{
		//Find Sum Of All Odd And Even Numbers
		Integer[] numbers = {8, 2, 7, 3, 1, 5};
		
		int sumOfOdd = 0;
        int sumOfEven = 0;

        for (Integer number : numbers) 
        {
            if (number % 2 == 0) 
            {
                sumOfEven += number;
            } 
            else 
            {
                sumOfOdd += number;
            }
        }

        System.out.println("Sum of odd numbers: " + sumOfOdd);
        System.out.println("Sum of even numbers: " + sumOfEven);
	}
}