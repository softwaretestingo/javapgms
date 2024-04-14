package com.softwaretestingo.array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
public class FindDuplicateElementFromArray4 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Duplicates Value From an Array Using Streams
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("********* Streams!|***********");
		Set<String>dataSet=new HashSet<String>();
		Set<String>dupSet=Arrays.asList(arrayElements).
							stream().filter(e-> !dataSet.add(e)).
							collect(Collectors.toSet());
		System.out.println(dupSet);
	}
}