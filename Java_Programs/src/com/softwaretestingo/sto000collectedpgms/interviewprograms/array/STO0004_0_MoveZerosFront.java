package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;

import java.util.Arrays;

public class STO0004_0_MoveZerosFront 
{
	/**
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 * 
	 * 1. The goal is to move all zeros to the beginning of the array while keeping the order 
	 * of the non‑zero elements unchanged.
	 * 2. I solve this in‑place by traversing the array from the end. I maintain an index 
	 * called current, which points to where the next non‑zero element should go.
	 * 3. Whenever I find a non‑zero element, I place it at the current position and 
	 * decrement the index.
	 * 4. After moving all non‑zero elements, the remaining positions at the start are 
	 * filled with zeros.
	 */
	public static void main(String[] args) 
	{
		int[] array = {5,0,4,6,0,7,0};
		System.out.println("Input:"+Arrays.toString(array));
		int current = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) 
		{
			if (array[i] != 0) 
			{
				array[current] = array[i];
				current--;
			}
		}
		while (current >= 0) 
		{
			array[current] = 0;
			current--;
		}
		System.out.print("Output: ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
	}
}