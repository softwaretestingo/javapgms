package com.softwaretestingo.sto00705_controlstatements.foreach;
public class STO0001_0_ForEachEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: For Each Loop For Iterating Array Values
	 * 
	 */
	public static void main(String[] args) 
	{
		int[] numbers = {1, 2, 3, 4, 5};
		for (int number : numbers) 
		{
			System.out.println(number);
		}
	}
}