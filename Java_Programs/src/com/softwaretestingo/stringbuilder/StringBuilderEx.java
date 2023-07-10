package com.softwaretestingo.stringbuilder;
public class StringBuilderEx 
{
	public static void main(String[] args) 
	{
		StringBuilder obj = new StringBuilder("Software Blog");
		obj.insert(8, "Testingo");

		System.out.println(obj);
	}
}