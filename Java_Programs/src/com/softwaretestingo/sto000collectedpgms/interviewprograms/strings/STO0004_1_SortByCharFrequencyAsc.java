package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.HashMap;
import java.util.Map;
public class STO0004_1_SortByCharFrequencyAsc 
{
	/**
	 * Input: 12bbccaaaammm
	 * Output: 12bbccmmmaaaa
	 * 
	 * We need to sort the string base on character size
	 */
	public static void main(String[] args) 
	{
		String str="12bbccaaaammm";
		System.out.println("Input: "+str);
		System.out.println("Output: "+sortFreq(str));
	}
	public static String sortFreq(String str) 
	{
		StringBuilder sb = new StringBuilder();

		Map<Character, Integer> hm = new HashMap<>();
		for (Character c : str.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		//System.out.println("frequency map of the String is " + hm);

		hm.entrySet().stream()
						.sorted(Map.Entry. <Character, Integer>comparingByValue())
						.forEach(a -> {Character key = a.getKey();
		int value = a.getValue();
		for (int i = 0; i < value; i++) {
			sb.append(key);
		}
		});
		//System.out.println(sb);

		return sb.toString();
	}
}
