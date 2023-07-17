package com.softwaretestingo.interviewprograms;
public class InterviewPrograms32 
{
	/*
	 * Input = “GDP in 2016 has fallen from 6.8% to 4.5%” 
	 * Output = “GDP in 6102 has fallen from 8.6% to 5.4%” 
	 * Only reverse the numbers of a string.
	 */
	public static void main(String[] args) 
	{
		String s="GDP in 2016 has fallen from 6.8% to 4.5%";
		StringBuffer rev=new StringBuffer();
		StringBuffer number=new StringBuffer();
		int length=s.length();
		for(int i=0;i<length;i++) {
			Character c=s.charAt(i);
			if(c.isDigit(c) || c.equals('.')) 
			{
				number.append(c);
			}
			else if(!number.isEmpty()) 
			{
				String rev1="";
				for(int j=number.length()-1;j>=0;j--) 
				{
					rev1=rev1+number.charAt(j);
				}
				rev.append(rev1+c);
				number.delete(0, number.length());
			}
			else 
			{
				rev.append(c);
			}
		}
		System.out.print(rev);
	}
}
