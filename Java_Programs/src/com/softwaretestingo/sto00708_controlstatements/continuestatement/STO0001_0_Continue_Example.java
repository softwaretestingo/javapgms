package com.softwaretestingo.sto00708_controlstatements.continuestatement;
public class STO0001_0_Continue_Example 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Use Of Continue Keyword
	 * 
	 */
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; ++i) 
		{      
			if (i > 4 && i < 9) 
			{
				continue;
			}      
			System.out.println(i);
		}   
	}
}