package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0121_6_InterviewPrograms 
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence please:");
		String str = scanner.nextLine();
		System.out.println("Enter a sentence please:");
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