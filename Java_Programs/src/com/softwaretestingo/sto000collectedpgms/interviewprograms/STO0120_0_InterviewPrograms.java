package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class STO0120_0_InterviewPrograms 
{
	public void countDupChars(String str)
	{	 
		//Create a HashMap 
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		//Convert the String to char array
		char[] chars = str.toCharArray();
		/* logic: char are inserted as keys and their count
		 * as values. If map contains the char already then
		 * increase the value by 1
		 */
		for(Character ch:chars)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		//Obtaining set of keys
		Set<Character> keys = map.keySet();
		/* Display count of chars if it is
		 * greater than 1. All duplicate chars would be 
		 * having value greater than 1.
		 */
		System.out.println("Output:");
		for(Character ch:keys)
		{
			if(map.get(ch) > 1)
			{
				System.out.println("Char "+ch+" "+map.get(ch));
			}
		}
	}
	public static void main(String[] args) 
	{
		STO0120_0_InterviewPrograms obj = new STO0120_0_InterviewPrograms();
		String str="softwaretestingo";
		System.out.println("Input: "+str);
		obj.countDupChars(str);

	}
}