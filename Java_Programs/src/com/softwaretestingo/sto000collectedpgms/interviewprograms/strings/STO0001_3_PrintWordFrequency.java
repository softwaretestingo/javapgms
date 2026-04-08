package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class STO0001_3_PrintWordFrequency 
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
		Map<String,Integer> map=new HashMap<>();
		String arr[]=str.split(" ");

		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		Set<Entry<String,Integer>> entry = map.entrySet();
		for(Entry<String,Integer> val: entry)
		{
			System.out.println(val.getKey()+" - "+val.getValue());
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