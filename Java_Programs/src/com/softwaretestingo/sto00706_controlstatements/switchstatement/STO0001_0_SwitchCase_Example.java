package com.softwaretestingo.sto00706_controlstatements.switchstatement;
public class STO0001_0_SwitchCase_Example 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Switch Case Statement Example
	 * 
	 */
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