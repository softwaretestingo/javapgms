package com.softwaretestingo.array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class FindDuplicateElementFromArray_UsingHashSet 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Duplicates from an Array Using HashSet
	 * 
	 */
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("********* Using HashSet ***********");
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arrayElements));
		Set<String> data=new HashSet<String>();
		System.out.println("Duplicates Elements are: ");
		for(String ele1: arrayElements)
		{
			if(data.add(ele1)== false)
			{
				System.out.println(ele1);
			}
		}
	}
}