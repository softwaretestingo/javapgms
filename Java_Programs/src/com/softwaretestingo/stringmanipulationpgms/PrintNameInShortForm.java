package com.softwaretestingo.stringmanipulationpgms;
import java.util.Scanner;
public class PrintNameInShortForm 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print Names In Short Form
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = sc.nextLine();
		String word = "";
		for(int i =0;i<name.length(); i++)
		{
			char ch = name.charAt(i); 
			if(ch!= ' ')
			{
			word = word+ch;
			}
			else
			{
			System.out.print(word.charAt(0)+".");
			word = "";
			}
		}
		System.out.print(word);
	}	
}