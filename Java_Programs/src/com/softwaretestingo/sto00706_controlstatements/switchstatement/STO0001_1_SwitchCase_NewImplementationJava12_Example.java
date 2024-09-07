package com.softwaretestingo.sto00706_controlstatements.switchstatement;

public class STO0001_1_SwitchCase_NewImplementationJava12_Example {
	/**
	 * Author: SoftwareTestingo Admin Blog: www.softwaretestingo.com URL:
	 * https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * 
	 * Problem Statement: Switch Case Statement New Implementation From Java 14 Onwards Example
	 * Now we can write the switch statement without break keyword in the place of break we can
	 * use the ->
	 * 
	 */
	public static void main(String[] args) {
		String day = "Thursday";

		switch (day) 
		{
			case "Monday" -> System.out.println("Today Is Monday");
			case "Tuesday" -> System.out.println("Today Is Tuesday");
			case "Wednesday" -> System.out.println("Today Is Wednesday");
			case "Thursday" -> System.out.println("Today Is Thursday");
			case "Friday" -> System.out.println("Today Is Friday");
			case "Saturday" -> System.out.println("Today Is Saturday");
			case "Sunday" -> System.out.println("Today Is Sunday");
			default -> System.out.println("Invalid Day");
		}
	}
}