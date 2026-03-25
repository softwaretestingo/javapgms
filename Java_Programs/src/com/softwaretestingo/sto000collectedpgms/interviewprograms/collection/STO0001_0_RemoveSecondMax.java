package com.softwaretestingo.sto000collectedpgms.interviewprograms.collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class STO0001_0_RemoveSecondMax 
{
	//Program Remove the second highest element from the HashMap
	/**
	 * Original Map: {Thirty=30, Twenty=20, FourTwenty=420, one Twenty=120, Ten=10}
	 * Sorted Map: {Ten=10, Twenty=20, Thirty=30, one Twenty=120, FourTwenty=420}
	 * After Removing Second Max Number: {Ten=10, Twenty=20, Thirty=30, FourTwenty=420}
	 * 
	 */
	public static void main(String[] args) 
	{
		Map<String, Integer> map = new HashMap<>();
		map.put("Thirty", 30);
		map.put("Ten", 10);
		map.put("Twenty", 20);
		map.put("FourTwenty", 420);
		map.put("one Twenty", 120);
		
		// print the map
		System.out.println("Original Map: "+map);
		
		//sorting
		LinkedHashMap<String, Integer> smap = map.entrySet().stream().sorted((t1,t2)->t1.getValue().compareTo(t2.getValue())).
		collect(Collectors.toMap(Map.Entry::getKey ,Map.Entry::getValue,(t1,t2)->t1,LinkedHashMap::new));
		System.out.println("Sorted Map: "+smap);
		
		int size = smap.size();
		//System.out.println(size);
		
		int max = Collections.max(smap.values()); int SecondMax = 0;
		for (int value : smap.values())
		{
			if (value > max)
				{
					SecondMax = max; max = value;
				}
			else if (value > SecondMax && value != max)
				{
					SecondMax = value;
				}
		}
		//System.out.println(SecondMax);
		Integer Value = SecondMax;
		
		for(Entry<String, Integer> entry: smap.entrySet())
		{
				if(entry.getValue() == Value) 
				{
					//System.out.println("The key of the: " + Value + " is " + entry.getKey());
					smap.remove(entry.getKey());
					break;
				}
		}
		System.out.println("After Removing Second Max Number: "+smap); 
	}
}