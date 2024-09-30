package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author SoftwareTestingo.com
 *
 */
public class STO0045_1_InterviewPrograms 
{
	/*
	 * Write a program that calculate the sum of all numbers present in alphanumeric
	 * string in sentence.
	 * 
	 * Input: "1a b23c de45f" 
	 * Output: 69 (1 + 23 + 45)
	 */
	public static void main(String[] args) 
	{
		String str = "1a b23cd e45f";
		System.out.println("Input: "+str);
		int sum = 0;
		String pattern = "\\d+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		while (m.find()) 
		{
			sum = sum + Integer.parseInt(m.group());
		}
		System.out.println("Output: "+sum);
	}
}