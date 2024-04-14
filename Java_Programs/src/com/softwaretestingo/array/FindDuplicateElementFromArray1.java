package com.softwaretestingo.array;
public class FindDuplicateElementFromArray1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Duplicates from an Array Using Brute Force Technique
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("****Brute Force Technique ****");
		for(int i=0;i<arrayElements.length;i++)
		{
			for(int j=i+1;j<arrayElements.length;j++)
			{
				if(arrayElements[i].equals(arrayElements[j]))
				{
					System.out.println(arrayElements[i]);
				}
			}
		}
	}
}