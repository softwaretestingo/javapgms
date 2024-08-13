package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
public class STO0023_0_InterviewPrograms 
{
	/*
	 * input :list1--[3,R,M,4,89,f] 
	 * OutPut:list2--[3,4,89,M,R,f]
	 */
	public static void main(String[] args) 
	{
		String[] arr = pushAllCharToRight(new String[] {"3" ,"R", "M" , "4" , "89" , "f"});
		System.out.println(Arrays.toString(arr));
	}
	public static String[] pushAllCharToRight(String[] array)
	{
		int i= 0 ;
		int j = array.length-1;
		while (i < j)
		{
			if (Character.isLetter(array[j].charAt(0)))
			{
				j--;
			}
			try
			{
				Integer.parseInt(array[i]);
				i++;
			}
			catch (NumberFormatException e)
			{
				String temp = array[j];
				array[j--] = array[i];
				array[i] = temp;
			}
		}
		return array;
	}
}