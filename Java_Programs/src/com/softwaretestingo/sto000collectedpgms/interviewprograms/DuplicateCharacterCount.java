package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class DuplicateCharacterCount 
{
	public void dupCharcount(String s)
	{
		Map<Character, Integer> baseMap= new HashMap<Character, Integer>();

		char carry[]=s.toCharArray();

		for (char c : carry) 
		{
			if(baseMap.containsKey(c))
			{
				// If character is present in map incrementing it's count by 1
				baseMap.put(c, baseMap.get(c)+1);
			}
			else
			{
				// If character is not present in map putting this character into map with 1 as it's value.
				baseMap.put(c, 1);
			}
		}

		// Traverse the HashMap, check if the count of the character is greater than 1 then print the character and its frequency
		for (Map.Entry<Character, Integer> entry : baseMap.entrySet()) 
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()  + " : "  + entry.getValue());
			}
		}
		/*Set<Character> keys = baseMap.keySet();  
		for (Character ch : keys) {  
			if (baseMap.get(ch) > 1) {  
				System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
			}  
		}*/  

		Integer min = Collections.min(baseMap.values());

		for (Entry<Character, Integer> c : baseMap.entrySet()) 
		{
			if(c.getValue().equals(min))
			{
				System.out.println(c.getKey() +"-"+ c.getValue());
			}
		}
	}  
	public static void main(String[] args) 
	{
		DuplicateCharacterCount obj = new DuplicateCharacterCount();
		obj.dupCharcount("monoj kumar pradhan ");
	}
}