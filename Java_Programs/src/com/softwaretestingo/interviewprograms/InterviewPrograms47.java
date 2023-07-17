package com.softwaretestingo.interviewprograms;
import java.util.HashMap;
import java.util.Map;
public class InterviewPrograms47 
{
	/*
	 * String input="1222bbbbcccaaaammmmm" 
	 * String output="1222cccbbbbaaaammmmm"
	 * 
	 * We need to sort the string base on character size
	 */
	public static void main(String[] args) 
	{
		System.out.println(sortFreq("1222bbbbcccaaaammmmm"));
	}
	public static String sortFreq(String str) {
		StringBuilder sb = new StringBuilder();

		Map<Character, Integer> hm = new HashMap<>();
		for (Character c : str.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		System.out.println(" frequency map of the String is " + hm);

		hm.entrySet().stream()
		.sorted(Map.Entry. <Character, Integer>comparingByValue())
		.forEach(a -> {Character key = a.getKey();
		int value = a.getValue();
		for (int i = 0; i < value; i++) {
			sb.append(key);
		}
		});
		System.out.println(sb);

		return sb.toString();
	}
}
