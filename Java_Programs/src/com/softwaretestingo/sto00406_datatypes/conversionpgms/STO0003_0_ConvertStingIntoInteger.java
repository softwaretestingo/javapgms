package com.softwaretestingo.sto00406_datatypes.conversionpgms;
public class STO0003_0_ConvertStingIntoInteger 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert String to Integer Using Integer.valueOf()  
	 * 
	 */
	public static void main(String[] args) 
	{
		String str = "123";
		int i = 123;
		if (i == (Integer.valueOf(str))) 
		{
			System.out.println("Both values are same");
		} 
		else
			System.out.println("Both values are not same");
	}
}