package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.ArrayList;
import java.util.Arrays;
public class STO0010_1_InterviewPrograms 
{
	/*
	 * Input:{A, B, C, D} 
	 * Output:{AA, BB, CC, DD}
	 */
	public static void main(String[] args) 
	{
		String[]arr= {"A","B","C","D"};
		System.out.println("Input: "+Arrays.toString(arr));
		ArrayList<String> AL=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			String str=arr[i]+arr[i];
			AL.add(str);
		}
		//System.out.println(arr);
		System.out.println("Output: "+AL);
	}
}