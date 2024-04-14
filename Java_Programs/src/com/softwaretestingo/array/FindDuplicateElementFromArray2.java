package com.softwaretestingo.array;
import java.util.HashSet;
import java.util.Set;
public class FindDuplicateElementFromArray2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Duplicates from an Array Using HashSet
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("********* HashSet ***********");
		Set<String> data=new HashSet<String>();
		for(String ele1: arrayElements)
		{
			if(data.add(ele1)== false)
			{
				System.out.println(ele1);
			}
		}
	}
}