package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class STO0011_3_PrintFrequencyOfEachCharacter 
{
	/*
	 * Input string "AAAABBCCCDDDDEEEG" 
	 * Output string "A4B2C3D4E3G1"
	 */ 
	public static void main(String[] args) 
	{
		String s = "AAAABBCCCDDDDEEEG";
		System.out.println("Input: "+s);
		String[] sArray = s.split("");
		Map<String, Integer> map = new HashMap<>();
		for(String temp : sArray) 
		{
			if(map.containsKey(temp)) 
			{
				map.put(temp, map.get(temp)+1);
			}
			else 
			{
				map.put(temp, 1);
			}
		}
		System.out.println("Output: "+map.toString().replaceAll("\\W",""));
	}
}