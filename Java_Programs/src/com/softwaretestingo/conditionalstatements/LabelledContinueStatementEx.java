package com.softwaretestingo.conditionalstatements;
public class LabelledContinueStatementEx 
{
	public static void main(String[] args) 
	{
		label:
			for (int i = 1; i < 6; ++i) 
			{
				for (int j = 1; j < 5; ++j) 
				{
					if (i == 3 || j == 2)
						continue label;
					System.out.println("i = " + i + "; j = " + j); 
				}
			} 
	}
}