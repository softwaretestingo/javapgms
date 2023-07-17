package com.softwaretestingo.interviewprograms;
public class InterviewPrograms12_2 
{
	/*
	 * Input: tomorrow 
	 * Output: t#m##rr###w
	 */
	public static String replaceWithString(String input,char present,String replace )
	{
		int count =0;
		String s ="";
		while(input.contains(Character.toString(present)))
		{
			int n = input.indexOf(present)>0?(count++):(count=0);
			if(count == n)
				break;
			for(int i= count; i>1; i--)
			{
				s+=replace;
			}
			input= input.replaceFirst(Character.toString(present),s);
		}
		return input;
	}

	public static void main(String[] args) 
	{
		String result=replaceWithString("tomorrow",'o',"#");
		System.out.println(result);
	}
}