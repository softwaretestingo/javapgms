package com.softwaretestingo.interviewprograms;
import java.util.Stack;
public class InterviewPrograms27 
{
	/*
	 * Input: reverse me without split 
	 * Output: esrever em tuohtiw tilps
	 */
	public static void main(String[] args) 
	{
		String str = "reverse me without split";
		Stack st=new Stack<Character>();
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