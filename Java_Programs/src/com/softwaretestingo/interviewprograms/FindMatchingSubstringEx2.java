package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class FindMatchingSubstringEx2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a sentence please:");
		String str = scanner.nextLine();
		System.out.println("Enter a sentence please:");
		String sub=scanner.next();
		int atIndex = 0;
		int count = 0;

		while (atIndex != -1)
		{
			atIndex = str.indexOf(sub, atIndex);

			if(atIndex != -1)
			{
				count++;
				atIndex += sub.length();
			}
		}
		System.out.println("Original String: "+str);
		System.out.println("Sub String: "+sub);
		System.out.println("Total Number Of Substring Appears: "+count);
	}
}