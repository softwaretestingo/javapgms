package com.softwaretestingo.enumeration;

public class EnumValueOfMethodUseEx 
{
	enum Days
	{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
	public static void main(String[] args) 
	{
		Days d;
		d=Days.valueOf("FRIDAY");	
		
		System.out.println(d);
	}
}