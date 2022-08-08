package com.softwaretestingo.interviewprograms;
public class ConvertInttoSting 
{
	public static void main(String[] args) 
	{
		String str = "123";
		int i = 123;
		if (i == (Integer.valueOf(str))) 
		{
			System.out.println("Both values are same");
		} 
		else
			System.out.println("Both values are not same");
	}
}
