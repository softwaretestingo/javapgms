package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class InterviewPrograms93_1 
{
	//Write a program for removing white spaces in a String.
	public static void main(String[] args) 
	{
		// create an object of Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");

		// take the input
		String str = sc.nextLine();
		System.out.println("Original String: " + str);

		char[] strArray = str.toCharArray();  
		StringBuffer stringBuffer = new StringBuffer();  
		for (int i = 0; i < strArray.length; i++) 
		{  
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) 
			{  
				stringBuffer.append(strArray[i]);  
			}  
		}  
		String noSpaceStr2 = stringBuffer.toString();  
		System.out.println("After Removing the Spaces: "+noSpaceStr2);  
	}
}