package com.softwaretestingo.sto000collectedpgms.interviewprograms.collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class STO0002_0_PrintTreeMap 
{
	/**
	 * Printing TreeMap elements using entrySet():
	 * Key: 1, Value: Banana
	 * Key: 2, Value: Orange
	 * Key: 3, Value: Apple
	 * Key: 4, Value: Grapes
	 * Printing TreeMap elements using iterators:
	 * Key: 1, Value: Banana
	 * Key: 2, Value: Orange
	 * Key: 3, Value: Apple
	 * Key: 4, Value: Grapes
	 * 
	 */
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
		System.out.println("Printing TreeMap elements using iterators:");
		Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();

		while (iterator.hasNext()) 
		{
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}