package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.HashMap;
import java.util.Map;
public class STO0047_0_InterviewPrograms 
{
	/*
	 * input="1222bbbbcccaaaammmmm" 
	 * output="1222cccbbbbaaaammmmm"
	 * 
	 * We need to sort the string base on character size
	 */
	public static void main(String[] args) 
	{
		String str="1222bbbbcccaaaammmmm";
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
