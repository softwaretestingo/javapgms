package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0037_0_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		char[] JavaCharArray = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println("Input: "+Arrays.toString(JavaCharArray));
		int val[]=new int[5];
		for(int i=0;i<5;i++)
		{
			val[i]=(int)JavaCharArray[i];
		}
		System.out.println("Output: "+checker(val));
	}

	public static boolean checker(int[] array) 
	{
		int array_element_count=array.length;
		int f_val=array[0];
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(array[i]==(f_val+i)) 
			{
				count++;
			}
		}
		if(count==array_element_count)
		{
			return true;
		}
		return false;
	}
}