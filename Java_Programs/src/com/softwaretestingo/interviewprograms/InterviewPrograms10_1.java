package com.softwaretestingo.interviewprograms;
import java.util.ArrayList;
public class InterviewPrograms10_1 
{
	/*
	 * Input:{A, B, C, D} 
	 * Output:{AA, BB, CC, DD}
	 */
	public static void main(String[] args) 
	{
		String[]arr= {"A","B","C","D"};
		ArrayList<String> AL=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			String str=arr[i]+arr[i];
			AL.add(str);
		}
		System.out.println(arr);
		System.out.println(AL);
	}
}