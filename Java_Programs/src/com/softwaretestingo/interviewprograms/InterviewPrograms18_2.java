package com.softwaretestingo.interviewprograms;

import java.util.Arrays;
import java.util.Comparator;

public class InterviewPrograms18_2 
{
	/*
	 * Input 11001101011 
	 * Output 1111100000 (first numeric 1 and followed by 0s)
	 */
	public static void main ( String args [ ] ) 
	{
		int [] arr = { 1,1,0,0,1,0,1,0,1,1 };
		int [ ] arr1= Arrays.stream(arr).boxed(). sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(arr1));
	}
}