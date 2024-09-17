package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
import java.util.LinkedList;
public class STO0021_1_InterviewPrograms 
{
	/*
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 */
	public static void main(String[] args) 
	{
		int z[]= {5,0,4,6,0,7,0};
		System.out.println("Input: "+Arrays.toString(z));
		LinkedList<Integer> zeroFirst = new LinkedList<>();
		for(int i:z)
		{
			if(i==0)
				zeroFirst.addFirst(i);
			else
				zeroFirst.add(i);
		}
		System.out.println("Output: "+zeroFirst);
	}
}