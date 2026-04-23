package com.softwaretestingo.abstraction;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) 
	{
		String str = "Manoj Kumar Rana";
		char[] arr=str.toCharArray();
		char[] newarr=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			if(Character.isSpace(arr[i]))
			{
				//System.out.println(i);
				newarr[i]=arr[i];
			}
		}
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] !=' ') 
			{
				while(arr[j] == ' ')
				{
					j--;
				}
				newarr[j]=arr[i];
				j--;
			}
		}
		System.out.println(newarr);
	}
}