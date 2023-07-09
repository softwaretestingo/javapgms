package com.softwaretestingo.string;
public class StringSplitEx11 
{
	public static void main(String[] args) 
	{
		String str="Welcome@to@SoftwareTestingo@Blog ";
		String arr[]=str.split("@", 0);
		for (String a : arr)
			System.out.println(a);
	}
}