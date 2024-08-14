package com.softwaretestingo.sto01101_stringmanipulationprograms;
public class ReverseStringWithReserveSpace 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Reverse String With Reserve The Space
	 * 
	 */
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