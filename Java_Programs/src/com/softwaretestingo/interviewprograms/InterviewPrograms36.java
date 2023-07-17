package com.softwaretestingo.interviewprograms;
import java.util.Stack;
public class InterviewPrograms36 
{
	// Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
	// Example: 
	// Input: exp = “[()]{}{[()()]()}” 
	// Output: Balanced
	// {},[],{]
	// Input: exp = “[(])” 
	// Output: Not Balanced
	public static void main(String[] args) 
	{
		String equ = "[()]{}{[()()]()}";
		Stack<Character> stack = new Stack<>();
		for (int i =0 ; i< equ.length() ; i++) 
		{
			if (equ.charAt(i) == '{' || equ.charAt(i) == '[' || equ.charAt(i) == '(') 
			{
				stack.push(equ.charAt(i));
			}
			else if (!stack.isEmpty() && ( (equ.charAt(i) == ']' && stack.peek() == '[') || (equ.charAt(i) == '}' && stack.peek() == '{') || (equ.charAt(i) == ')' && stack.peek() == '(')))
			{
				stack.pop();
			}
			else 
			{
				stack.push(equ.charAt(i));
			}
		}
		if (stack.empty())
		{
			System.out.println(stack.toString());
			System.out.println("balanced");
		}
		else 
		{
			System.out.println(stack.toString());
			System.out.println("Not balanced");
		}
	}
}
