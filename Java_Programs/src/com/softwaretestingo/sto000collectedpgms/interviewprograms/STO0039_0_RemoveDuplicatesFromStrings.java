package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Stack;
public class STO0039_0_RemoveDuplicatesFromStrings 
{
	/*
	 * Input string : weelccoommee hhoommeee 
	 * Output string : welcome home
	 */
	public static void main(String[] args) 
	{
		String s = "weelccoommee hhoommeee";
		System.out.println("Input: "+s);
		Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		for (int i = 1; i<s.length(); i++ ) 
		{
			if (s.charAt(i-1) != s.charAt(i))
				st.push(s.charAt(i));
		}
		System.out.print("Output: ");
		for ( Character c : st )
			System.out.print(c) ;
	}
}