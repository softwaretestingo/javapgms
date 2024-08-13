package com.softwaretestingo.sto00704_controlstatements.forloop;
public class STO0002_0_NestedForLoopEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Nested For Loop Example
	 * 
	 */
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) 
		{
			for (int j = 1; j <= 10; j++) 
			{
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}