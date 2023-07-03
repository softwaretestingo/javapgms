package com.softwaretestingo.conditionalstatements;
public class SwitchCase_Example 
{
	public static void main(String[] args) 
	{
		int dayOfWeek = 2;
		String dayString;

		switch (dayOfWeek) {
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			dayString = "Invalid day";
			break;
		}

		System.out.println("Today is " + dayString);

	}
}