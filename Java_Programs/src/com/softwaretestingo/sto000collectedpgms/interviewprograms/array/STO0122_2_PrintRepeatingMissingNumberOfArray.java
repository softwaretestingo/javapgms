package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class STO0122_2_PrintRepeatingMissingNumberOfArray 
{
	public static void main(String[] args) 
	{
		int[] arr = { 4, 3, 6, 2, 1, 1, 2 };
		System.out.println("Input: "+Arrays.toString(arr));
		Map<Integer, Boolean> numberMap = new HashMap<>();

		int max = arr.length;
		System.out.println("Output: ");
		for (Integer i : arr) 
		{

			if (numberMap.get(i) == null) 
			{
				numberMap.put(i, true);
			}
			else 
			{
				System.out.println("Repeating = " + i);
			}
		}
		for (int i = 1; i < max; i++)
		{
			if (numberMap.get(i) == null) 
			{
				System.out.println("Missing = " + i);
			}
		}
	}
}