package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.HashMap;
import java.util.Map;
public class EachCharacterCountInString 
{
	public static void m1(String s)
	{
		Map<Character, Integer> baseMap= new HashMap<Character, Integer>();

		char carry[]=s.toCharArray();

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
		m1("SoftwareTestingo");
	}
}