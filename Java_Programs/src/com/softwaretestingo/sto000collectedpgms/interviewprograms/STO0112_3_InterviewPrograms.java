package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Arrays;
import java.util.List;
public class STO0112_3_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		// ([1,2,3,4,5],2) How many times loop will iterate here?
		//Asked In HealthTech

		// Question: ([1,2,3,4,5],2) and output:2

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println("Input: "+list);
		int n = 2;

		for (int i = 0; i < n; i++) 
		{
			System.out.println(list.get(i));
		}
	}
}