package com.softwaretestingo.STRING;
public class StringSplitEx3 
{
	public static void main(String[] args) 
	{
		String str="Learning:Welcome to SoftwareTestingo Blog";
		String arr[]=str.split(":");
		for (String a : arr)
			System.out.println(a);
	}
}