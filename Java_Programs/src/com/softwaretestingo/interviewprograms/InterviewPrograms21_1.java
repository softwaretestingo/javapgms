package com.softwaretestingo.interviewprograms;
import java.util.LinkedList;
public class InterviewPrograms21_1 
{
	/*
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 */
	public static void main(String[] args) 
	{
		int z[]= {5,0,4,6,0,7,0};
		LinkedList<Integer> zeroFirst = new LinkedList<>();
		for(int i:z)
		{
			if(i==0)
				zeroFirst.addFirst(i);
			else
				zeroFirst.add(i);
		}
		System.out.println(zeroFirst);
	}
}