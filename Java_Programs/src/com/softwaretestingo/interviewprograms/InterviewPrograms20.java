package com.softwaretestingo.interviewprograms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class InterviewPrograms20 
{
	/*
	 * Input 1B3A2D4C 
	 * Output BAAADDCCCC
	 * WALLMART
	 */
	public static void main(String[] args)
	{
		String s = "1B3A2D4C";
		String[] sArray = s.split("");
		List<String> intList = new ArrayList<>();
		List<String> sList = new ArrayList<>();
		for(String temp : sArray) {
			if(temp.matches("[a-zA-Z]")) {
				sList.add(temp);
			}
			else 
			{
				intList.add(temp);
			}
		}
		Map<String, Integer> map = new LinkedHashMap<>();
		Iterator<String> itr1 = sList.iterator();
		Iterator<String> itr2 = intList.iterator();
		while(itr1.hasNext() && itr2.hasNext()) 
		{
			map.put(itr1.next(), Integer.parseInt(itr2.next()));
		}
		for(Map.Entry<String, Integer> m : map.entrySet()) 
		{
			for(int i=0;i<m.getValue();i++)
			{
				System.out.print(m.getKey());
			}
		}
	}
}