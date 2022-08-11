package com.softwaretestingo.interviewprograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class FindDuplicateElementFromArray3 
{
	public static void main(String[] args) 
	{
		String arrayElements[] = {"Testing","Manual Testing", "Java","Automation Testing", "Software Testing","Java", "Testing"};
		System.out.println("************ hash map **************");
		Map<String, Integer>arrayMap=new HashMap<String, Integer>();
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