package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class STO0001_1_MaxCharFrequency 
{	
	/**
	 * Input: www.SoftwareTestingo.com
	 * Output: {a=1, c=1, e=2, f=1, g=1, i=1, m=1, .=2, n=1, o=3, r=1, S=1, s=1, t=2, T=1, w=4}
	 * w=4
	 * 
	 */
	public static void main(String[] args) 
	{	
		String s="www.SoftwareTestingo.com";
		System.out.println("Input: "+s);
		System.out.println("Output: ");
		Map<Character, Integer> basmap=new HashMap<Character, Integer>();
		char [] carry=s.toCharArray();

		for (char c : carry) 
		{
			if(basmap.containsKey(c))
			{
				basmap.put(c, basmap.get(c)+1);
			}
			else
			{
				basmap.put(c, 1);
			}
		}
		System.out.println(basmap);

		Integer max=Collections.max(basmap.values());
		Set<Entry<Character, Integer>> entrySet=basmap.entrySet();
		for(Entry<Character, Integer> val: basmap.entrySet())
		{
			if(val.getValue().equals(max))
			{
				System.out.println( val.getKey() + "=" +  val.getValue());
			}
		}
	}
}