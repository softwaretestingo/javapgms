package com.softwaretestingo.interviewprograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class FindDuplicateCharactersEx2 
{
	public static void printDuplicateCharacters(String str)
	{
		if(str == null)
		{
			System.out.println("NULL String");
			return;
		}
		if(str.isEmpty())
		{
			System.out.println("Empty String");
			return;
		}
		if(str.length()==1)
		{
			System.out.println("Single Char String");
			return;
		}
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
		printDuplicateCharacters(null);
		printDuplicateCharacters("");
		printDuplicateCharacters("A");
		printDuplicateCharacters("Softwaretestimgo");
	}
}