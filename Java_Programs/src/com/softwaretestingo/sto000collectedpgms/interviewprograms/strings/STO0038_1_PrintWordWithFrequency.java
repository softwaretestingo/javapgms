package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
public class STO0038_1_PrintWordWithFrequency 
{
	//Write a program to print the frequency of words in a paragraph
	/**
	 * Enter the string: Welcome to Java Session Session Session
	 * Java - 1
	 * Session - 3
	 * Welcome - 1
	 * to - 1
	 * 
	 */
	private static void countfreqword(String str) 
	{
		Map<String,Integer> mp=new TreeMap<>();
		String arr[]=str.split(" ");

		for(int i=0;i<arr.length;i++)
		{
			if(mp.containsKey(arr[i]))
			{
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else
			{
				mp.put(arr[i],1);
			}
		}

		for(Map.Entry<String,Integer> entry:mp.entrySet())
		{
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}
	public static void main(String[] args) throws IOException 
	{
		String str;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string: ");
		str=br.readLine();
		countfreqword(str);
	}
}