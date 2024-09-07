package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0048_0_InterviewPrograms 
{
	/*
	 * Input string : test986java656hello 
	 * Output : tset986avaj656olleh
	 */
	public static void main(String[] args) 
	{
		String str="test986java656hello";
		System.out.println("Input: "+str);
		disp(str);
	}
	public static void disp(String str)
	{
		String[] strarr=str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		for (int i=0;i<strarr.length;i++)
		{
			if(! Character.isDigit(strarr[i].charAt(0)))
			{
				strarr[i]=rev(strarr[i]);
			}
		}


		String s2=String.join("", strarr);
		System.out.println("Output: "+s2);
	}

	public static String rev(String str) 
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}
}