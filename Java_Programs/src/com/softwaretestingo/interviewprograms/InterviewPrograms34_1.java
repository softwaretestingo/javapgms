package com.softwaretestingo.interviewprograms;
import java.util.HashSet;
public class InterviewPrograms34_1
{
	/*
	 * List a[ ] = [2, 1,1,4,5,5,6,7] 
	 * Expected output : [2,4, 6,7] 
	 * Numbers which gets repeated we should remove and make output as above I know using HashSet
	 * we get as [2, 1,4,5 , 6,7] But interviewee asked about deleting repeated ones
	 */
	public static void main(String[] args) 
	{
		Integer ar[]= {2,1,1,4,5,5,6,7};
		HashSet<Integer> hs= new HashSet<Integer>();
		
		for(int s1:ar)
		{
			if(hs.add(s1)==false)
			{
				hs.remove(s1);
			}
		}
		System.out.println(hs);
	}
}