package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Stack;
public class STO0027_0_ReverseEachWordOfString 
{
	/*
	 * Input: reverse me without split 
	 * Output: esrever em tuohtiw tilps
	 */
	public static void main(String[] args) 
	{
		String str = "reverse me without split";
		System.out.println("Input: "+str);
		Stack st=new Stack<Character>();
		System.out.print("Output: ");
		for (int i = 0; i < str.length(); ++i) 
		{
			if (str.charAt(i) != ' ')
				st.push(str.charAt(i));
			else {
				while (st.empty() == false) 
				{
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
		}
		while (st.empty() == false) 
		{
			System.out.print(st.pop());
		}
	}
}