package com.softwaretestingo.interviewprograms;
public class InterviewPrograms21_2 
{
	/*
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 */
	public static void main(String[] args) 
	{
		int [] a = {5, 0, 4, 6, 0, 7, 0};
		String s = "";
		for (int i : a) 
		{
			if (i == 0)
				s = i + "," + s;
			else
				s = s + i + ",";
		}
		for (String i : s.split(","))
			System.out.print(i+" ");
	}
}