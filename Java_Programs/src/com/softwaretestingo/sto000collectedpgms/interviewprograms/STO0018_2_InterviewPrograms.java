package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;
import java.util.Comparator;

public class STO0018_2_InterviewPrograms 
{
	/*
	 * Input 11001101011 
	 * Output 1111100000 (first numeric 1 and followed by 0s)
	 */
	public static void main ( String args [ ] ) 
	{
		int [] arr = { 1,1,0,0,1,0,1,0,1,1 };
		System.out.println("Input: "+Arrays.toString(arr));
		int [ ] arr1= Arrays.stream(arr).boxed(). sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		System.out.println("Output: "+Arrays.toString(arr1));
	}
}