package com.softwaretestingo.array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class FindDuplicateElementFromArray6 
{
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("********* Streams using frequency *********");
		List<String>list=Arrays.asList(arrayElements);
		Set<String>eleList=list.stream().filter(e -> Collections.frequency(list,e)>1)
				.collect(Collectors.toSet());
		System.out.println(eleList);
	}
}