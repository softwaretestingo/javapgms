package com.softwaretestingo.interviewprograms;
import java.util.Arrays;
public class InterviewPrograms52 
{
	/*
	 * Input { "Hi" , "maven" , "selenium " , "java" } 
	 * Output{ "Hi", "java", "maven" , "selenium" }
	 */
	public static void main(String[] args) 
	{
		String ip[]={"Hi","maven","selenium","java"};

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
		System.out.println(Arrays.toString(ip));
	}
}