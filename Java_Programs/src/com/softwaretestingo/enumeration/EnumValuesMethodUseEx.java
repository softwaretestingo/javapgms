package com.softwaretestingo.enumeration;

public class EnumValuesMethodUseEx 
{
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