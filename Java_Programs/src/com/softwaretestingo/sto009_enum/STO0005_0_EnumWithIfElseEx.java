package com.softwaretestingo.sto009_enum;
public class STO0005_0_EnumWithIfElseEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Use Enum With If Else Statement
	 * 
	 */
	enum WeekDays
	{ 
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
	}
	public static void main(String[] args) 
	{
		WeekDays weekDays = WeekDays.WEDNESDAY;

		if(weekDays == WeekDays.SUNDAY || weekDays == WeekDays.SATURDAY)
			System.out.println("It is Weekend");
		else 
			System.out.println("It is weekday: "+weekDays);
	}
}