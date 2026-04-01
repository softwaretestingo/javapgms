package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class STO0001_2_CharCountMinMax 
{
	/**
	 * Input: Monojjonon
	 * Character occurrence in a string- {j=2, M=1, n=3, o=4}
	 * Min Value : 1 Max Value : 4
	 * Ascending order values - {M=1, j=2, n=3, o=4}
	 * 
	 */
	public static void main(String[] args) 
	{
		String name="Monojjonon";
		System.out.println("Input: "+name);
		char []ch=name.toCharArray();
		Map<Character,Integer > bmap = new HashMap<Character, Integer>();
		Map<Character, Integer> sortedMap = new LinkedHashMap<>();
		List<Integer> list = new ArrayList<>();

		for (char c : ch) 
		{
			if(bmap.containsKey(c)) 
			{
				bmap.put(c, bmap.get(c)+1);
			}
			else
			{
				bmap.put(c, 1);
			}
		}

		System.out.println("Character occurrence in a string- " + bmap);

		Integer minValue=Collections.min(bmap.values());
		Integer maxValue=Collections.max(bmap.values());

		System.out.println("Min Value : " + minValue + " Max Value : " + maxValue);


		for (Entry<Character, Integer> entry : bmap.entrySet()) 
		{
			list.add(entry.getValue());
		}
		Collections.sort(list);

		for (Integer num : list) 
		{
			for (Entry<Character, Integer> entry : bmap.entrySet()) 
			{
				if(entry.getValue().equals(num))
				{
					sortedMap.put(entry.getKey(), num);
				}
			}
		}
		System.out.println("Ascending order values - " + sortedMap);
	}
}