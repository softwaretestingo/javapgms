package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0021_0_MovingAllZerosToBeginning 
{
	/*
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 */
	public static void main(String[] args) 
	{
		int[] array = {5,0,4,6,0,7,0};
		System.out.println("Input:"+Arrays.toString(array));
		int current = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) 
		{
			if (array[i] != 0) {
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