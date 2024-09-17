package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0105_0_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name : ");
		String name = sc.nextLine();
		String word = "";
		System.out.print("Short Form: ");
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