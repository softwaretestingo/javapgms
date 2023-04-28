package com.softwaretestingo.ConditionalStatements;
public class LabeledBreakStatementEx2 
{
	public static void main(String[] args) 
	{
		lab1:
		{
			int i = 10;
			if (i == 10)
				break lab1; // Ok. lab1 can be used here
		}
		lab2:
		{
			int i = 10;
			if (i == 10) 
			{
				// A compile-time error. lab1 cannot be used here because this block is not
				// associated with the lab1 label. We can use the only lab2 in this block
				//break lab1;
			}
		}
	}
}