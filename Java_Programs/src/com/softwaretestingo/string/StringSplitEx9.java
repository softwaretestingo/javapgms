package com.softwaretestingo.string;
public class StringSplitEx9 
{
	public static void main(String[] args) 
	{
		String str="Welcome@to@SoftwareTestingo@Blog ";
		String arr[]=str.split("@", 3);
		for (String a : arr)
			System.out.println(a);
	}
}