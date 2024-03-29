package com.softwaretestingo.interviewprograms;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class InterviewPrograms7 
{
	/*
	 * Input= abbcccdeee 
	 * Output= a1b2c3d1e3
	 */
	public static void main(String[] args) 
	{
		String s="abbcccdeee";
		char [ ] ch= s.toCharArray();
		Map<Character, Integer> maps= new LinkedHashMap<Character,Integer>();
		for (Character c:ch)
		{
			Integer count = maps.get(c);
			if (count != null)
			{
				maps.put (c, ++count);
			} 
			else 
			{
				maps.put(c,1);
			}
		}
		StringBuffer sb = new StringBuffer();
		for (Entry< Character , Integer > entry : maps.entrySet()) 
		{
			sb.append(entry.getKey()).append(entry.getValue());
		}
		System.out.println (sb);
	}
}