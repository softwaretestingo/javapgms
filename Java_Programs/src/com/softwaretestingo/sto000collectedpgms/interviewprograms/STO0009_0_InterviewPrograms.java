package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.ArrayList;
import java.util.List;
public class STO0009_0_InterviewPrograms 
{
	/*
	 * Input: 1234
	 * Output:{1234, 11223344, 111222333444, 1111222233334444}
	 */

	public static void main(String[] args) 
	{
		String num = "1234";
		System.out.println("Input: "+num);
		String finals = "";
		char arr[] = num.toCharArray();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++) 
			{
				for (int k = 0; k < i + 1; k++) 
				{
					finals = finals + arr[j];
				}
			}
			list.add(finals);
			finals = "";
		}
		System.out.println("Output: "+list);
	}
}