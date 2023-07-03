package com.softwaretestingo.conditionalstatements;
public class LabeledBreakStatementEx1 
{
	public static void main(String[] args) 
	{
		blockLabel:
		{
			int i = 10;
			for(i=0;i<=10;i++)
			{
				if (i == 5) 
				{
					System.out.println("Break Statement Is going to Execute");
					break blockLabel; // Exits the block
				}

				if (i == 10) 
				{
					System.out.println("i is not five");
				}
			}
		}
	}
}