package com.softwaretestingo.sto000collectedpgms.numbers;
public class OddandEvenNumbers1to100 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print All The Even Numbers Present Between 1 to 100 
	 * 
	 */
	public static void main(String[] args) 
	{
		int n = 100;
		System.out.print("Even Numbers from 1 to "+n+" are: ");
		for (int i = 1; i <= n; i++) 
		{
			//if number%2 == 0 it means its an even number
			if (i % 2 == 0) 
			{
				System.out.print(i + " ");
			}
		}
	}
}