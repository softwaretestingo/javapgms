package com.softwaretestingo.sto01101_stringmanipulationprograms;
public class STG01ReverseWordsInAGivenString 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: 
	 * 
	 * 1. Mask Few Numbers Of The Credit Card Number
	 * 2. After masking Add - after four letter
	 */
	public static void main(String[] args) 
	{
		String str="54505956381548620";
		System.out.println("Input: "+str);
		
		String FirstString=str.substring(0, 6);
		String lastSubString=str.substring((str.length()-5), str.length());
		String middleStrting=str.substring(7,(str.length()-5));
		String maskString= middleStrting.replaceAll("[0-9]", "*");
		
		String finalString=FirstString+maskString+lastSubString;
		System.out.println("After Masking: "+finalString);
		
		char arr[]=finalString.toCharArray();
		StringBuilder builder=new StringBuilder();;
		
		for(int i=0;i<str.length()-1;i++)
		{
			builder.append(arr[i]);
			if(i==3||i==7||i==11)
			{
				builder.append("-");
				//builder.append(arr[i]);
			}
		}
		System.out.println("After Adding -: "+builder.toString());
	}
}