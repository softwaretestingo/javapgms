package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0003_7_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence please:");
		String str = scanner.nextLine();
		System.out.print("Enter a sentence please:");
		String sub=scanner.next();

		int lastIndex = 0;
		int count = 0;

		while((lastIndex = str.indexOf(sub, lastIndex)) != -1)
		{
			count++;
			lastIndex += sub.length() - 1;
		}
		System.out.println("Original String: "+str);
		System.out.println("Sub String: "+sub);
		System.out.println("Total Number Of Substring Appears: "+count);
	}
}