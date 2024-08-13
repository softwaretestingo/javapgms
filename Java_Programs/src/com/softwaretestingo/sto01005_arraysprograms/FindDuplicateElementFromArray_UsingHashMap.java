package com.softwaretestingo.sto01005_arraysprograms;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class FindDuplicateElementFromArray_UsingHashMap 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Duplicates Value From an Array Using HashMap
	 * 
	 */
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("************ HashMap **************");
		System.out.println("Original Elements: "+ Arrays.toString(arrayElements));
		System.out.println("Duplicate Elements are:");
		Map<String, Integer> arrayMap=new HashMap<String, Integer>();
		for(String e: arrayElements)
		{
			Integer count = arrayMap.get(e);
			if(count == null)
			{
				arrayMap.put(e,1);
			}
			else
			{
				arrayMap.put(e, ++ count);
			}
		}

		// print all the duplicate elements:
		Set<Entry<String,Integer>> entrySet=arrayMap.entrySet();
		for(Entry<String,Integer> entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}