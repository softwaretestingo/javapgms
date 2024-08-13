package com.softwaretestingo.sto01005_arraysprograms;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FindDuplicateElementFromArray_StreamsGroupingBy 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Duplicates Value From an Array Using Streams Grouping By
	 * 
	 */
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("********** Streams Grouping By **********");
		System.out.println("Original Elements: "+ Arrays.toString(arrayElements));
		System.out.println("Duplicate Elements are:");
		Set<String> eleset = Arrays.asList(arrayElements).stream().
								collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
								entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
		
		System.out.println(eleset);
	}
}