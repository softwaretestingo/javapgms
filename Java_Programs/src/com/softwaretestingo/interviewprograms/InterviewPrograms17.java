package com.softwaretestingo.interviewprograms;
import java.util.Set;
import java.util.TreeMap;
public class InterviewPrograms17 
{
	/*
	 * Input string: "AcBCbDEdea" 
	 * Output string:"AaBbCcDdEe"
	 */
	public static void main(String[] args) 
	{
		TreeMap<Character,Integer> map1 = new TreeMap<Character,Integer>();
		String S1="AcBCbDEdea";
		System.out.println("Given Initial String: "+S1);
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
		System.out.print("The String Gets Transformed to the Below Format: ");
		for(Character character:set)
		{
			if(map1.get(character)==2)
			{
				System.out.print(Character.toUpperCase(character)+""+Character.toLowerCase(character));
			}
		}
	}
}