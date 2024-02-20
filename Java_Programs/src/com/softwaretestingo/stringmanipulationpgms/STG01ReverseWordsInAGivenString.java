package com.softwaretestingo.stringmanipulationpgms;
public class STG01ReverseWordsInAGivenString 
{
	public static void main(String[] args) 
	{
		String str="5450595638154862 ";
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
				builder.append(arr[i]);
			}
		}
		System.out.println("After Adding -: "+builder.toString());
	}
}