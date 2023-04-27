package com.softwaretestingo.ConditionalStatements;
import java.util.ArrayList;
import java.util.List;
public class ForEachEx2 
{
	public static void main(String[] args) 
	{
		List<String> fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		for (String fruit : fruits) 
		{
		    System.out.println(fruit);
		}

	}
}