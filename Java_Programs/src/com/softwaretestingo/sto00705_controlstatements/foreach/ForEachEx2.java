package com.softwaretestingo.sto00705_controlstatements.foreach;
import java.util.ArrayList;
import java.util.List;
public class ForEachEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: For Each Loop To Iterate Collection Objects
	 * 
	 */
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