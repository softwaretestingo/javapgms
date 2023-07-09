package com.softwaretestingo.string;
public class SubSequenceExample2 
{
	public static void main(String[] args) 
	{
		String stringObject = "This example is with negative index";

		CharSequence output = stringObject.subSequence(-10, stringObject.length());
		System.out.println(output);
	}
}