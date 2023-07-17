package com.softwaretestingo.interviewprograms;
import java.util.HashMap;
import java.util.Map;
public class InterviewPrograms19_1 
{
	/*
	 * Input string "AAAABBCCCDDDDEEEG" 
	 * Output string "A4B2C3D4E3G1"
	 */ 
	public static void main(String[] args) 
	{
		String s = "AAAABBCCCDDDDEEEG";
		String[] sArray = s.split("");
		Map<String, Integer> map = new HashMap<>();
		for(String temp : sArray) {
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}
			else {
				map.put(temp, 1);
			}
		}
		System.out.println(map.toString().replaceAll("\\W",""));
	}
}
