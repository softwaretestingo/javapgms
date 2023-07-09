package com.softwaretestingo.string;
public class StringSplitEx7 
{
	public static void main(String[] args) 
	{
		String str="Hi User Welcome    to    SoftwareTestingo Blog    ";
		String arr[]=str.split("\\s+");
		System.out.println("The Total Number of Words Is: "+arr.length);
		for (String a : arr)
			System.out.println(a);
	}
}