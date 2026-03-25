package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Scanner;
public class STO0003_1_SubstringCount 
{
	/**
	 * Enter a sentence please:manual testing automation testing
	 * Enter a sentence please:testing
	 * Original String: manual testing automation testing
	 * Sub String: testing
	 * Total Number Of Substring Appears: 2
	 * 
	 */
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence please:");
		String str = scanner.nextLine();
		System.out.print("Enter a sentence please:");
		String sub=scanner.next();

		int count =0;
		int findStrLength = sub.length();
		for(int i=0;i<str.length();i++)
		{
			if(sub.startsWith(Character.toString(str.charAt(i))))
			{
				if(str.substring(i).length() >= findStrLength)
				{
					if(str.substring(i, i+findStrLength).equals(sub))
					{
						count++;
					}
				}
			}
		}


		System.out.println("Original String: "+str);
		System.out.println("Sub String: "+sub);
		System.out.println("Total Number Of Substring Appears: "+count);
	}
}