package com.softwaretestingo.array;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class FindDuplicateElementFromArray3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Duplicates Value From an Array Using HashMap
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("************ HashMap **************");
		
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