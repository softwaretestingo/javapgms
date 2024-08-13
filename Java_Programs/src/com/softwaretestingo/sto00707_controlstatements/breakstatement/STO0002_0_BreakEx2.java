package com.softwaretestingo.sto00707_controlstatements.breakstatement;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class STO0002_0_BreakEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Use Of Break Keyword
	 * 
	 */
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