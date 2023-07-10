package com.softwaretestingo.string;
public class StringSplitEx12 
{
	public static void main(String[] args) 
	{
		String str="Hi User Welcome    to    SoftwareTestingo Blog    ";
		String arr[]=str.split(" ");
		System.out.println("The Total Number of Words Is: "+arr.length);
		for (String a : arr)
			if(!a.isEmpty())
			{
				System.out.println(a);
			}
	}
}