package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.ArrayList;
import java.util.List;
public class STO0073_0_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		List<String> names = new ArrayList<String>();

		names.add("WelCOmeuio");
		names.add("Monoj");
		names.add("Anjalidfghjkl;");
		names.add("Anjalidfghjkl;");
		names.add("Two");

		/*tring len= names.stream().max(Comparator.comparingInt(String::length)).get();
	      System.out.println(len); */

		String longestString = names.get(0);

		for (String str : names) 
		{
			if(str.length() < longestString.length()) 
			{
				longestString=str;
			}
		}
		System.out.println(longestString);
	}
}