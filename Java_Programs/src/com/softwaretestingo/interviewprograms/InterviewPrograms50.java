package com.softwaretestingo.interviewprograms;
public class InterviewPrograms50 
{
	/*
	 * Input is a phone number Ex : 1234567890 
	 * Output: (123)45-67-890
	 */
	public static void main(String[] args) 
	{
		String input="1234567890";
		
		String output=input.replaceFirst("(\\d{3})(\\d{2})(\\d{2})(\\d+)", "($1)$2-$3-$4");
		System.out.println(output);
		
		String output1="("+input.substring(0,3)+")"+input.substring(3,5)+"-"+input.substring(5,7)+"-"+input.substring(7);
		System.out.println(output1);
	}
}