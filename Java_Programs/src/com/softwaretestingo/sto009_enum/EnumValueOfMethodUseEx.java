package com.softwaretestingo.sto009_enum;
public class EnumValueOfMethodUseEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Get The Value From ENUM using  valueOf()
	 * 
	 */
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