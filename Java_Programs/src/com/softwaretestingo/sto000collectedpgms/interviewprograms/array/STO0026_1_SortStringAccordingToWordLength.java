package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Arrays;
public class STO0026_1_SortStringAccordingToWordLength 
{
	/*
	 * Input { "Hi" , "maven" , "selenium " , "java" } 
	 * Output{ "Hi", "java", "maven" , "selenium" }
	 */
	public static void main(String[] args) 
	{
		String ip[]={"Hi","maven","selenium","java"};
		System.out.println("Input: "+Arrays.toString(ip));
		for(int i=0;i<ip.length;i++)
		{
			for(int j=i+1;j<ip.length;j++)
			{
				if(ip[i].length()>ip[j].length())
				{
					String temp=ip[j];
					ip[j]=ip[i];
					ip[i]=temp;
				}
			}
		}
		System.out.println("Output: "+Arrays.toString(ip));
	}
}