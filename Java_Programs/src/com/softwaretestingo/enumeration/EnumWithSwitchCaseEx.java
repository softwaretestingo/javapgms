package com.softwaretestingo.enumeration;
enum AllDirections 
{
	NORTH,
	SOUTH,
	EAST,
	WEST
}
public class EnumWithSwitchCaseEx 
{
	public static void main(String[] args) 
	{
		AllDirections adr=AllDirections.SOUTH;

		switch(adr)
		{
		
		// You can use the constants which are declared inside the Enum
		case NORTH:
			System.out.println("North direction");
			break;
		case SOUTH:
			System.out.println("South direction");
			break;
		case EAST:
			System.out.println("East directiion");
			break;
		case WEST:
			System.out.println("West directiion");
			break;
		}
	}
}