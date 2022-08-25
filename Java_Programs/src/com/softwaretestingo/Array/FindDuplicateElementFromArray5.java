package com.softwaretestingo.Array;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementFromArray5 
{
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("********** Streams grouping by **********");
		Set<String> eleset = Arrays.asList(arrayElements).stream().
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
				entrySet().stream().filter(e -> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
		
		System.out.println(eleset);
	}
}