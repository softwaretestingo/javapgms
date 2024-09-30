package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class STO0054_0_TwoStringAreIsomorphic 
{
	/*
	 * Given two strings s and t, determine if they are isomorphic. Two strings s
	 * and t are isomorphic if the characters in s can be replaced to get t.
	 * 
	 * All occurrences of a character must be replaced with another character while
	 * preserving the order of characters. No two characters may map to the same
	 * character, but a character may map to itself.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "egg", t = "add" 
	 * Output: true Example 2:
	 * 
	 * Input: s = "foo", t = "bar" 
	 * Output: false Example 3:
	 * 
	 * Input: s = "paper", t = "title" 
	 * Output: true
	 */
	public static void main(String[] args) 
	{
		String str1="egg";
		String str2="add";
		System.out.println("Input: "+str1+", "+str2);
		System.out.println("Output: "+areIsomorphic(str1,str2));
	}
	static boolean areIsomorphic(String str1, String str2)
	{
		List<Integer> str1ChrSequence=getCharSequence(str1);
		List<Integer> str2ChrSequence=getCharSequence(str2);
		return str1ChrSequence.equals(str2ChrSequence);
	}

	static List<Integer> getCharSequence(String str)
	{
		Map<Character,Integer> resultMap=new LinkedHashMap<>();
		int count=1;
		for(char ch:str.toCharArray())
		{
			if(resultMap.containsKey(ch))
			{
				resultMap.put(ch,resultMap.get(ch)+1);
			}
			else
			{
				resultMap.put(ch,count);
			}
		}
		List<Integer> resultList=new ArrayList<>();
		resultList.addAll(resultMap.values());
		return resultList;
	}
}
