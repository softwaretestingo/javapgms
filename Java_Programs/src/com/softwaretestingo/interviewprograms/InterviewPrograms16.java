package com.softwaretestingo.interviewprograms;
import java.util.Arrays;
public class InterviewPrograms16 
{
	/*
	 * Input : he is a good boy 
	 * Output: yo bd o ogas ieh
	 */
	public static void main(String[] args) 
	{
		String input="he is a good boy";
		String[] split=input.split(" ");
		
		StringBuilder sb=new StringBuilder(input.replaceAll(" ", ""));
		sb.reverse();
		
		int count=0;
		for(String o:Arrays.asList(split).subList(0, split.length-1))
		{
			count=count+o.length();
			sb.insert(count, " ");
			count++;
		}
		System.out.println(sb);
	}
}