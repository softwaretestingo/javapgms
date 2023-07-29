package com.softwaretestingo.interviewprograms;
public class InterviewPrograms74_SortStringBasedOnTheirLength 
{
	public static void main(String[] args) 
	{
		String str="this interview is for CBA";
		String temp;
		String []sw=str.split(" ");

		for(int i=0; i<sw.length;i++)
		{
			for(int j=i+1; j<sw.length; j++)
			{
				if(sw[i].length()> sw[j].length())
				{
					temp= sw[i]; 
					sw[i]=sw[j]; 
					sw[j]=temp; 
				}
			}
		}
		for (int i = 0; i < sw.length; i++) 
		{
			System.out.print(sw[i]+ " ");
		}
	}
}