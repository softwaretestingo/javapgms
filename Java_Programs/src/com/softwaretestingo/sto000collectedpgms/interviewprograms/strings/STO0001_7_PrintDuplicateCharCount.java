package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class STO0001_7_PrintDuplicateCharCount 
{
	/**
	 * Entered Substring: Softwaretestimgo
	 * Duplicate Character:Count
	 * t                    :3
	 * e                    :2
	 * o                    :2
	 * 
	 */
	public static void printDuplicateCharacters(String str)
	{
		char words[] = str.toCharArray();// java
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch: words)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch,charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch,1);
			}
		} 
		System.out.println("Entered Substring: "+str);
		// print the map:
		Set<Map.Entry<Character, Integer >> entrySet = charMap.entrySet();
		System.out.println("Duplicate Character"+":"+"Count");
		for(Map.Entry<Character, Integer>entry : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"                    :"+entry.getValue());
			}
		}
	}
	public static void main(String[] args) 
	{
		printDuplicateCharacters("Softwaretestimgo");
	}
}