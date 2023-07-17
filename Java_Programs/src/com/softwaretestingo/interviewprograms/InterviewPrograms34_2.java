package com.softwaretestingo.interviewprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class InterviewPrograms34_2
{
	/*
	 * List a[ ] = [2, 1,1,4,5,5,6,7] 
	 * Expected output : [2,4, 6,7] 
	 * Numbers which gets repeated we should remove and make output as above I know using HashSet
	 * we get as [2, 1,4,5 , 6,7] But interviewee asked about deleting repeated ones
	 */
	public static void main(String[] args) 
	{
		ArrayList<Integer> intList= new ArrayList<>(Arrays.asList(2,1,1,4,5,5,6,7));
		HashMap<Integer,Integer> getCount=new HashMap<Integer,Integer>();
		for ( int c : intList ) 
		{
			if (getCount.containsKey(c)) 
			{
				getCount.put(c, getCount.get(c)+1);
			} 
			else 
			{
				getCount.put(c,1);
			}
		}
		List<Integer> newIntList= new ArrayList<Integer>();
		for (int c:intList )
		{
			if ( getCount.get(c)<2)
			{
				newIntList.add (c);
			}
		}
		System.out.println(newIntList);
	}
}