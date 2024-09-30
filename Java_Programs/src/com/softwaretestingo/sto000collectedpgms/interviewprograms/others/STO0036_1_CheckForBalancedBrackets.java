package com.softwaretestingo.sto000collectedpgms.interviewprograms.others;
import java.util.HashMap;
import java.util.LinkedList;
public class STO0036_1_CheckForBalancedBrackets 
{
	// Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
	// Example: 
	// Input: exp = “[()]{}{[()()]()}” 
	// Output: Balanced
	// {},[],{]
	// Input: exp = “[(])” 
	// Output: Not Balanced

	static HashMap<String, String> bracketDetails=new HashMap<String, String>();
	public static void main(String[] args) 
	{
		storeBracketStartAndEnd();
		String testString = "[{()}](){()}";
		System.out.println("Input: "+testString);
		boolean status = true ;
		LinkedList<String> l1 = new LinkedList<String>();
		testString = testString.replaceAll("[^\\(\\{\\[\\)\\}\\]]", "");
		for ( int i = 0 ; i < testString.length(); i++ )
		{
			String element = String.valueOf(testString.charAt(i));
			if (element.equalsIgnoreCase("(")||element.equalsIgnoreCase("{")||element.equalsIgnoreCase("["))
			{
				l1.addFirst (bracketDetails.get(element));
			}
			else 
			{
				if (! element.equalsIgnoreCase(l1.getFirst())) 
				{
					status = false;
					break;
				} 
				else 
				{
					l1.removeFirst();
				}
			}

		}
		if (status) 
		{
			System.out.println("Output: "+"Balanced");
		} 
		else 
		{
			System.out.println("Output: "+"Not Balanced");
		}
	}
	public static void storeBracketStartAndEnd() 
	{
		bracketDetails.put("(",")");
		bracketDetails.put("{","}");
		bracketDetails.put("[","]");
	}
}
