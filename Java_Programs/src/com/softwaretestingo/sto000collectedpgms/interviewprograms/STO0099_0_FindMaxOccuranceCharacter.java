package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class STO0099_0_FindMaxOccuranceCharacter 
{
	/*
	 * How to find 2nd largest duplicate character from given String using map? Ex:
	 * 
	 * String str = "abbcccddddcc" ; O/p d:4 
	 * String str2= "annnyrggrrrrrrr" ; O/p:3
	 */

	/*
	 * 1. Create a `HashMap<Character, Integer>` to store the character as the key and its count as the value. 
	 * 2. Iterate through the string and populate the map with the character counts. 
	 * 3. Create an array or list to store the counts. 
	 * 4. Iterate through the map values and add the counts to the array. 
	 * 5. Sort the array in descending order. 
	 * 6. Traverse the sorted array and find the second largest count. 
	 * 7. Iterate through the map again to find the character corresponding to the second largest count.
	 */
	public static void main(String[] args) 
	{
		String str = "abbcccddddcc";
		System.out.println("Input: "+str);
		Map<Character, Integer> charCountMap = new HashMap<>();
		// Populate the character count map
		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}
		List<Integer> counts = new ArrayList<>(charCountMap.values());
		Collections.sort(counts, Collections.reverseOrder());
		int secondLargestCount = counts.get(1);
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) 
		{
			if (entry.getValue() == secondLargestCount) 
			{
				System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
				break;
			}
		}
	}
}