package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class STO0099_1_FindMaxOccuranceCharacter 
{
	/*
	 * How to find 2nd largest duplicate character from given String using map? Ex:
	 * 
	 * String str = "abbcccddddcc" ; O/p d:4 
	 * String str2= "annnyrggrrrrrrr" ; O/p:3
	 */
	//If you do not want to use entrySet then u can use this logics
	

	public static Map<Character,Integer> solution(String str) 
	{
		Object ch=null;
		Map<Character,Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();
		for(int i =0; i<charArray.length; i++)
		{
			if(map.containsKey(charArray[i]))
			{
				int count=map.get(charArray[i]);
				map.put(charArray[i],count + 1);           
			}
			else 
			{
				map.put(charArray[i],1);
			}
		}
		int largest = -1 ;
		int secondLarge = -1 ;

		for(Entry<Character,Integer> m : map.entrySet()) 
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
		String str1="annnyrggrrrrrrr";
		STO0099_1_FindMaxOccuranceCharacter.solution(str);
		STO0099_1_FindMaxOccuranceCharacter.solution(str1);
	}
}