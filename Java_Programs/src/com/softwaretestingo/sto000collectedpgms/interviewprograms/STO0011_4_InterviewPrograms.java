package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class STO0011_4_InterviewPrograms 
{
	/*
	 * Input string "AAAABBCCCDDDDEEEG" 
	 * Output string "A4B2C3D4E3G1"
	 */ 
	public static void main (String [] args)
	{
		String str = "AAAABBCCCDDDDEEEG";
		System.out.println("Input: "+str);
		occurences (str);
	}
	public static void occurences(String str)
	{
		int count = 0 ;
		Map <Character, Integer> hs=new HashMap <Character ,Integer>();
		for ( int i = 0 ; i<str.length(); i++) 
		{
			if ( hs.containsKey(str.charAt(i))) 
			{
				count =hs.get(str.charAt(i));
				count = count+1;
				hs.put(str.charAt(i),count);
			} 
			else 
			{
				hs.put(str.charAt(i), 1);
			}
		}
		Set<Map.Entry <Character, Integer>> s = hs.entrySet();
		System.out.print("Output: ");
		for (Entry<Character,Integer> s1 : s ) 
		{
			System.out.print (s1.getKey()+ ""+s1.getValue());  
		}            
	}
}