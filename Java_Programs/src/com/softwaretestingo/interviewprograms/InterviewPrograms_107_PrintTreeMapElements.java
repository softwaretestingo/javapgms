package com.softwaretestingo.interviewprograms;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class InterviewPrograms_107_PrintTreeMapElements 
{
	public static void main(String[] args) 
	{
		// Create a TreeMap
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		// Add elements to the TreeMap
		treeMap.put(3, "Apple");
		treeMap.put(1, "Banana");
		treeMap.put(2, "Orange");
		treeMap.put(4, "Grapes");
		
		// Iterate over the TreeMap using entrySet
		System.out.println("Printing TreeMap elements using entrySet():");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) 
		{
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
		// Alternatively, you can use iterators
		System.out.println("\nPrinting TreeMap elements using iterators:");
		Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();

		while (iterator.hasNext()) 
		{
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}