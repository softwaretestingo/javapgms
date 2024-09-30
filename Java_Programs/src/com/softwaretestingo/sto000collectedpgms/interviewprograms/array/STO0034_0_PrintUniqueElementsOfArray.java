package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class STO0034_0_PrintUniqueElementsOfArray
{
	/*
	 * List a[ ] = [2, 1,1,4,5,5,6,7] 
	 * Expected output : [2,4, 6,7] 
	 * Numbers which gets repeated we should remove and make output as above I know using HashSet
	 * we get as [2, 1,4,5,6,7] But interviewee asked about deleting repeated ones
	 */
	public static void main(String[] args) 
	{
		Integer arr[]= {2,1,1,4,5,5,6,7};
		System.out.println("Input: "+Arrays.toString(arr));
		List <Integer> ar = Arrays.asList(arr);
		HashMap<Integer,Integer> hm = new HashMap<>();
		ar.forEach(e ->{if(hm.containsKey(e))
		{
			hm.remove(e);
		}
		else
		{
			hm.put(e,1);
		}});
		ar = new ArrayList<>(hm.keySet());
		System.out.println("Output: "+ar);
	}
}