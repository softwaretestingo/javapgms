package com.softwaretestingo.enumeration;
public class EnumWithIfElseEx 
{
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