package com.softwaretestingo.sto000collectedpgms.interviewprograms.array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class STO0026_0_SortStringAccordingToWordLength 
{
	/*
	 * Input : {"looking", "you", "handsome", "are"} 
	 * Output: You are looking handsome
	 */
	public static void main(String[] args) 
	{
		String[] Input = {"looking", "you", "handsome", "are"};
		System.out.println("Input: "+Arrays.toString(Input));
		List<String> res=new ArrayList<>();
		int j=0;
		for (int i = 0; i < Input.length; i++)
		{
			if(i%2!=0) 
			{
				res.add(j, Input[i]);
				j++;
			}
			else 
			{
				res.add(Input[i]);
			}
		}
		System.out.println("Output: "+res);
	}
}