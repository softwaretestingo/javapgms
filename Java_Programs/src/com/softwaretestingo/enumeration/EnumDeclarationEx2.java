package com.softwaretestingo.enumeration;
public class EnumDeclarationEx2 
{
	//To declare enum keyword is used instead of class keyword
	enum Directions
	{ 
		NORTH, SOUTH, EAST, WEST;
	}
	public static void main(String[] args) 
	{
		// For Creating referenceno need of New Keyword
		Directions dr=Directions.WEST;
		
		System.out.println("Direction is: "+dr);
	}
}