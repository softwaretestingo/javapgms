package com.softwaretestingo.interviewprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InterviewPrograms97_1 
{
	//Write a program to print the frequency of specific words in a paragraph
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String: ");
		String s=br.readLine();
		System.out.println("Enter substring: ");
		String sub=br.readLine();
		int ind,count=0;
		for(int i=0; i+sub.length()<=s.length(); i++)    //i+sub.length() is used to reduce comparisions
		{
			ind=s.indexOf(sub,i);
			if(ind>=0)
			{
				count++;
				i=ind;
				ind=-1;
			}
		}
		System.out.println("Occurence of '"+sub+"' in String is "+count);
	}
}