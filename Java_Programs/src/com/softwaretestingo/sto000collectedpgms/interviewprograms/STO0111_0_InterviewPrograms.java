package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.ArrayList;
import java.util.List;

public class STO0111_0_InterviewPrograms 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * Problem Statement:
	 * How you Find the Second-to-last Character of Each word in a given String?
	 * Company - Encora
	 * 
	 * Input: This ia a Sample String
	 * Output: iiln
	 * 
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str="This ia a Sample String";
		String words[]=str.split(" ");
		List<String> chars=new ArrayList<>();
		for(String word:words)
		{
			int len=word.length();
			if(len>1)
			{
				chars.add(word.substring(len-2, len-1));
			}
		}
		System.out.println("Input: "+str);
		System.out.println("Output: "+String.join("",chars));
	}
}