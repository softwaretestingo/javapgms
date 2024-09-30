package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Set;
import java.util.TreeMap;
public class STO0017_0_SortAlphabetByIgnoringCase 
{
	/*
	 * Input string: "AcBCbDEdea" 
	 * Output string:"AaBbCcDdEe"
	 */
	public static void main(String[] args) 
	{
		TreeMap<Character,Integer> map1 = new TreeMap<Character,Integer>();
		String S1="AcBCbDEdea";
		System.out.println("Input: "+S1);
		char[] array = S1.toLowerCase().toCharArray();
		for(char c:array)
		{
			if(map1.containsKey(c))
			{
				map1.put(c,map1.get(c)+1);
			}
			else
			{
				map1.put(c,1);
			}
		}
		Set<Character> set=map1.keySet();
		System.out.print("Output: ");
		for(Character character:set)
		{
			if(map1.get(character)==2)
			{
				System.out.print(Character.toUpperCase(character)+""+Character.toLowerCase(character));
			}
		}
	}
}