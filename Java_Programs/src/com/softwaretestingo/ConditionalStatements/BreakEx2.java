package com.softwaretestingo.ConditionalStatements;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class BreakEx2 
{
	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "John", "Dave");
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) 
		{
			String name = iterator.next();
			System.out.println(name);
			if (name.equals("John")) 
			{
				System.out.println("Encountered John, stopping.");
				break;
			}
		}
	}
}