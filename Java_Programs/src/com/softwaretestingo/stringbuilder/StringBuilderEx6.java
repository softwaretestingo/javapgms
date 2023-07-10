package com.softwaretestingo.stringbuilder;
public class StringBuilderEx6 
{
	public static void main(String[] args) 
	{
		StringBuilder first = new StringBuilder("Software");
		first.append("Testingo");
		System.out.println("After Append: "+first);

		first.append(111);
		System.out.println("After Adding Different Datatype: "+first);
	}
}