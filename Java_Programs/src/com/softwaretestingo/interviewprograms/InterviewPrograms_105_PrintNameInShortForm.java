package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class InterviewPrograms_105_PrintNameInShortForm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = sc.nextLine();
		String word = "";
		for (int i = 0; i < name.length(); i++) 
		{
			char ch = name.charAt(i);
			if (ch != ' ') 
			{
				word = word + ch;
			} 
			else 
			{
				System.out.print(word.charAt(0) + ".");
				word = "";
			}
		}
		System.out.print(word);
	}
}