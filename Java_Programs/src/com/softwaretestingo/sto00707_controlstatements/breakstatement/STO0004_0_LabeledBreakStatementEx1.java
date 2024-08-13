package com.softwaretestingo.sto00707_controlstatements.breakstatement;
public class STO0004_0_LabeledBreakStatementEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Labeled Break Statement Example
	 * 
	 */
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