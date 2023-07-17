package com.softwaretestingo.interviewprograms;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class PrintMaxRepeatingCharacterWithCount 
{	
	public static void main(String[] args) 
	{	
		String s="www.SoftwareTestingo.com";

		Map<Character, Integer> basmap=new HashMap<Character, Integer>();

		char [] carry=s.toCharArray();

		for (char c : carry) 
		{
			//if(Character.isAlphabetic(c)) {
			if(basmap.containsKey(c))
			{
				basmap.put(c, basmap.get(c)+1);
			}
			else
			{
				basmap.put(c, 1);
			}
			//}
		}
		System.out.println(basmap);

		Integer max=Collections.max(basmap.values());
		System.out.println(max);

		for(Entry<Character, Integer> val: basmap.entrySet())
		{
			if(val.getValue().equals(max))
			{
				System.out.println( val.getKey() + "=" +  val.getValue());
			}
		}
	}
}