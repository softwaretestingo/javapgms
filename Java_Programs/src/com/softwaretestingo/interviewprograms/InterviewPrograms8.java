package com.softwaretestingo.interviewprograms;
import java.util.ArrayList;
import java.util.List;
public class InterviewPrograms8 
{
	/*
	 * Input:  Today is January 5th 
	 * Output: 5thja nu aryisTo day
	 */
	public static void main(String[] args) 
	{
		String input = "Today is January 5th";
		String[] output = input.split(" ");
		StringBuffer sb = new StringBuffer();
		List<Integer> spaceIndex = new ArrayList<>();
		for (int i=0; i<output.length-1; i++ ) 
		{
			spaceIndex.add(input.indexOf(" ")+i);
			input=input.replaceFirst(" ","");
		}
		for ( int i=output.length-1; i>=0 ;i--)
		{
			sb.append(output[i]);
		}
		for ( int i : spaceIndex ) 
			sb.insert(i," ");
		System.out.println(sb);
	}
}