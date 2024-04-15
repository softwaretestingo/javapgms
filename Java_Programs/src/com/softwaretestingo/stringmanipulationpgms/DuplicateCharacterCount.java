package com.softwaretestingo.stringmanipulationpgms;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicateCharacterCount 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Character & Counts Of a String 
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="You are Welcome to Software Testingo log For Learning";
		char ch[]=str.toCharArray();
		Map<Character, Integer> maps=new HashMap<Character, Integer>();
		for(Character c:ch)
		{
			if(maps.containsKey(c))
			{
				maps.put(c, maps.get(c)+1);
			}
			else
				maps.put(c, 1);
		}
		Set<Character> keys = maps.keySet();
		for(Character c:keys)
		{
			if(maps.get(c)>1)
			{
				System.out.println(c + " "+maps.get(c));
			}
		}
	}
}