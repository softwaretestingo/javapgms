package com.softwaretestingo.stringmanipulationpgms;

public class RemoveWhiteSpaces 
{
	public static void main(String[] args) 
	{
		String str="You are Welcome to Software Testingo log For Learning";
		String st[]=str.split(" ");
		for(String s:st)
		{
			System.out.print(s);
		}
		System.out.println();
		System.out.println("-------------------------------");
		String str1="You are Welcome to Software Testingo log For Learning";
		String st1[]=str1.split("\\s");
		for(String s:st1)
		{
			System.out.print(s);
		}
		System.out.println();
		System.out.println("----------------------------------");
		String str2="You are Welcome to        Software Testingo       log For  Learning";
		String st2[]=str2.split("\\s+");
		for(String s:st2)
		{
			System.out.println(s);
		}

	}

}
