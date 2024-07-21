package com.softwaretestingo.array;
import java.util.Arrays;
public class FindDuplicateElementFromArray_UsingBruteForceTechnique 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Duplicates from an Array Using Brute Force Technique
	 *
	 */
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing","Java","SoftwareTestingo","Java", "Testing"};
		System.out.println("****Brute Force Technique ****");
		System.out.println("Original Elements: "+ Arrays.toString(arrayElements));
		System.out.println("Duplicate Elements are:");
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