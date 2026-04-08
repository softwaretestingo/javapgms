package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class STO0001_4_SecondMaxCharFrequency 
{
	/**
	 * How to find 2nd largest duplicate character from given String using map? Ex:
	 * 
	 * Second Large Character Value From String abbcccddddcc is:  Character d And Count is: 4
	 * Second Large Character Value From String annnyrggrrrrrrr is:  Character n And Count is: 3
	 */
	//If you do not want to use entrySet then u can use this logics
	

	public static Map<Character,Integer> solution(String str) 
	{
		System.out.println("Input String is: "+str);
		Object ch=null;
		Map<Character,Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();
		for(int i =0; i<charArray.length; i++)
		{
			if(map.containsKey(charArray[i]))
			{
				map.put(charArray[i],map.get(charArray[i])+ 1);           
			}
			else 
			{
				map.put(charArray[i],1);
			}
		}
		int largest = -1 ;
		int secondLarge = -1 ;

		Set<Entry<Character,Integer>> entry = map.entrySet();
		for(Entry<Character,Integer> m : entry ) 
		{
			if(m.getValue()>largest ) 
			{
				secondLarge=largest ;
				ch=m.getKey();
				largest = m.getValue();
			} 
			else if(m.getValue()<largest && m.getValue()>secondLarge) 
			{
				secondLarge = m.getValue();
				ch=m.getKey();
			}
		}
		System.out.println("Second Large Character Value From String " + str +" is: "+" Character "+ch +" And Count is: "+secondLarge);
		return map;
	}
	public static void main(String[] args) 
	{
		String str="abbcccddddcc";
		STO0001_4_SecondMaxCharFrequency.solution(str);
	}
}