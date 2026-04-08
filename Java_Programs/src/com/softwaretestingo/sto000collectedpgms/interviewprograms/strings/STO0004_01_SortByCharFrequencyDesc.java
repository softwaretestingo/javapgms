package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class STO0004_01_SortByCharFrequencyDesc 
{
	/**
	 * Input: tomorrow 
	 * Output: ooorrtmw
	 */
	public static void main(String[] args) 
	{
		String input = "tomorrow";
		System.out.println("Input: " + input);

		// Step 1: Find character frequency
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		// Step 2: Convert map to list for sorting
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

		// Step 3: Sort by frequency descending
		for (int i = 0; i < list.size() - 1; i++) 
		{
			for (int j = i + 1; j < list.size(); j++) 
			{
				if (list.get(i).getValue() < list.get(j).getValue()) 
				{
					Map.Entry<Character, Integer> temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

		// Step 4: Print characters based on frequency
		System.out.print("Output: ");
		for (Map.Entry<Character, Integer> entry : list) 
		{
			int count = entry.getValue();
			while (count > 0) 
			{
				System.out.print(entry.getKey());
				count--;
			}
		}
	}
}