package com.softwaretestingo.interviewprograms;
import java.util.Arrays;
import java.util.stream.Collectors;
public class RemoveDuplicateCharactersEx3 
{
	public static void main(String[] args) 
	{
		String orignalString = "Java";

		String output = Arrays.asList(orignalString.split(""))
				.stream()
				.distinct()
				.collect(Collectors.joining());
		System.out.println("Original String : " + orignalString);
		System.out.println("After removing the duplicates : " + output);
	}
}