package com.softwaretestingo.sto011_STRINGS;
public class StringSplitEx4 
{
	public static void main(String[] args) 
	{
		String str="Welcome to SoftwareTestingo Blog";
		String arr[]=str.split(" ");
		for (String a : arr)
			System.out.println(a);
	}
}