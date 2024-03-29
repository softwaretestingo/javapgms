package com.softwaretestingo.stringmanipulationpgms;

import java.util.Arrays;

public class ReverseStringWithReserveSpace {

	public static void main(String[] args) 
	{
		String str="Welcome To Software Testingo Blog";
		System.out.println("Original String: "+str);
		char inputStringArray[]=str.toCharArray();
		char resultArray[]=new char[inputStringArray.length];
		for(int i=0;i<inputStringArray.length;i++)
		{
			if(inputStringArray[i]==' ')
			{
				resultArray[i]=' ';
			}
		}
		int j=resultArray.length-1;
		for(int i=0;i<inputStringArray.length;i++)
		{
			if(inputStringArray[i] != ' ')
			{
				if(resultArray[j] == ' ')
                {
                    j--;
                }
				resultArray[j]=inputStringArray[i];
				j--;
			}
		
		}
		System.out.println("After Reverse: "+String.valueOf(resultArray));
	}

}
