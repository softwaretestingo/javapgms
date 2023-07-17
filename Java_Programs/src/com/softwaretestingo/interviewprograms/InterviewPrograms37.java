package com.softwaretestingo.interviewprograms;
public class InterviewPrograms37 
{
	public static void main(String[] args) 
	{
		char[] JavaCharArray = { 'a', 'b', 'c', 'd', 'e' };
		int val[]=new int[5];
		for(int i=0;i<5;i++)
		{
			val[i]=(int)JavaCharArray[i];
		}
		System.out.println(checker(val));
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