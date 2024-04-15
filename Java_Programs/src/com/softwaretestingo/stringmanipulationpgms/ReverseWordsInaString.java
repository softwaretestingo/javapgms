package com.softwaretestingo.stringmanipulationpgms;
public class ReverseWordsInaString 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split The String and Print All The Values
	 * 
	 */
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