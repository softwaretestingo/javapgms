package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.ArrayList;
import java.util.List;
public class STO0008_0_ReverseStringByPreservingSpaces 
{
	/*
	 * Input:  Today is January 5th 
	 * Output: 5thja nu aryisTo day
	 */
	public static void main(String[] args) 
	{
		String input = "Today is January 5th";
		System.out.println("Input: "+input);
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
		System.out.println("Output: "+sb);
	}
}