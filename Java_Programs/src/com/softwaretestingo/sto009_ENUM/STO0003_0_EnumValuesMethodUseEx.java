package com.softwaretestingo.sto009_ENUM;
public class STO0003_0_EnumValuesMethodUseEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print All The Values Of Enum using values() method
	 * 
	 */
	enum Days
	{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
	public static void main(String[] args) 
	{
		System.out.println("Here are the All Days Name");
		// This will return all the constants as an array of days Enum
		Days day[]=Days.values();
		
		for (Days d: day)
		{
			System.out.println(d);
		}
	}
}