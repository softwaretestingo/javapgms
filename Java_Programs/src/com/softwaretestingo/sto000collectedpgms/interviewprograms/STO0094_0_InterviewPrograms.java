package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0094_0_InterviewPrograms 
{
	//Write a program for Find the First Index Of a Specific Character.
	public static void main(String[] args) throws IOException 
	{
		String str;
		char c; 

		// create an object of Scanner
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		str=br.readLine();

		System.out.println("Enter the Character you want to search");
		c=(char)br.read();

		int index = str.indexOf(c);
		System.out.printf(c +" is present at index %d", index);
	}
}