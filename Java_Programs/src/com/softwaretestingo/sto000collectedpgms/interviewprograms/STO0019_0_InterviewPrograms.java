package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.ArrayList;
public class STO0019_0_InterviewPrograms 
{
	/*
	 * Input string "AAAABBCCCDDDDEEEG" 
	 * Output string "A4B2C3D4E3G1"
	 */ 
	public static void main(String[] args) 
	{
		String s ="AAAABBCCCDDDDEEEG";
		System.out.println("Input: "+s);
		ArrayList<Character> list = new ArrayList<>();
		System.out.print("Output: ");
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			if(!list.contains(s.charAt(i)))
			{
				list.add(s.charAt(i));
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
					}
				}
				System.out.print(s.charAt(i)+""+count);
			}
		}
	}
}