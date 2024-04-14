package com.softwaretestingo.enumeration;
//To declare enum keyword is used instead of class keyword
enum Direction
{ 
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Enum Use In Java
	 * 
	 */
	NORTH, SOUTH, EAST, WEST;
}
public class EnumDeclarationEx1 
{
	public static void main(String[] args) 
	{
		// For Creating referenceno need of New Keyword
		Direction dr=Direction.EAST;
		System.out.println("Direction is: "+dr);
	}
}