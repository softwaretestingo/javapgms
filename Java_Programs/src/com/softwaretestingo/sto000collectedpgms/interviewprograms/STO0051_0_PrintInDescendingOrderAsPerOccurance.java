package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class STO0051_0_PrintInDescendingOrderAsPerOccurance 
{
	/*
	 * Input: tomorrow 
	 * Output: ooorrtmw
	 */
	public static void main(String[] args) 
	{
		String input = "tomorrow";
		System.out.println("Input: "+input);
		Map<Character, Integer> map = StringManipulation(input);
		// sort and print
		List<Map.Entry<Character, Integer>> toSort = new ArrayList<>(map.entrySet());
		toSort.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		System.out.print("Output: ");
		for ( Map.Entry<Character, Integer> x : toSort ) 
		{
			int count = x.getValue();
			while ( count > 0 ) 
			{
				System.out.print ( x.getKey ( ) ) ;
				count-- ;
			}
		}
	}
	private static Map<Character, Integer> StringManipulation(String input) 
	{
		Map<Character, Integer> map=new LinkedHashMap<>();
		for(char ch : input.toCharArray())
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		return map;
	}
}