package com.softwaretestingo.conditionalstatements;
public class BreakEx3 
{
	public static void main(String[] args) 
	{
		int[][] numbers = { { 2, 4, 6 }, { 7, 9, 10 }, { 11, 12, 13 } };

		for (int i = 0; i < numbers.length; i++) 
		{
			for (int j = 0; j < numbers[i].length; j++) 
			{
				if (numbers[i][j] <= 5) 
				{
					continue;
				}
				System.out.println("Found a number greater than 5: " + numbers[i][j]);
			}
		}
	}
}