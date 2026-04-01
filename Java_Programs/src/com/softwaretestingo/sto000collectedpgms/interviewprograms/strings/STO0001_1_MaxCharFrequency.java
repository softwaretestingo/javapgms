package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.HashMap;
import java.util.Map;
public class STO0001_1_MaxCharFrequency 
{
	/**
	 * Input: SoftwareTestingo
	 * Output: {a=1, e=2, f=1, g=1, i=1, n=1, o=2, r=1, S=1, s=1, t=2, T=1, w=1}
	 * 
	 */
	public static void m1(String s)
	{
		Map<Character, Integer> baseMap= new HashMap<Character, Integer>();
		char carry[]=s.toCharArray();
		System.out.println("Output: ");
		for (char c : carry) 
		{
			if(baseMap.containsKey(c))
			{
				baseMap.put(c,  baseMap.get(c)+1);
			}
			else
			{
				baseMap.put(c, 1);
			}
		}
		System.out.println(baseMap);
	}

	public static void main(String[] args) 
	{
		String input="SoftwareTestingo";
		System.out.println("Input: "+input);
		m1(input);
	}
}