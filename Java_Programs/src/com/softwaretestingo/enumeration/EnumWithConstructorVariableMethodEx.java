package com.softwaretestingo.enumeration;
public class EnumWithConstructorVariableMethodEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Get the value From Enum
	 * 
	 */
	enum colors
	{
		RED(10),BLUE(20),GREEN(30),ORANGE(40);
		
		// variables
		private int colorcode;
		
		//method
		private int getColorCode()
		{
			return colorcode;
		}
		
		//Constructor
		colors(int colorcode)
		{
			this.colorcode=colorcode;
		}
	}
	public static void main(String[] args) 
	{
		colors cr;
		System.out.println("Colorcode Of Green is : "+colors.GREEN.getColorCode());
	}
}