package com.softwaretestingo.string;
public class StringSplitEx6 
{
	public static void main(String[] args) 
	{
		String str="Learn.Welcome to SoftwareTestingo Blog";
		String arr[]=str.split("\\.|\\s");
		for (String a : arr)
			System.out.println(a);
	}
}