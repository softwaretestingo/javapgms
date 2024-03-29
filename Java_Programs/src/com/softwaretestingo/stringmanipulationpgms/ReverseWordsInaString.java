package com.softwaretestingo.stringmanipulationpgms;

public class ReverseWordsInaString {

	public static void main(String[] args) 
	{
		String str="Welcome to Software Testingo Blog";
		String starr[]=str.split(" ");
		for(int i=starr.length-1;i>=0;i--)
		{
			System.out.println(starr[i]);
		}
	}

}
