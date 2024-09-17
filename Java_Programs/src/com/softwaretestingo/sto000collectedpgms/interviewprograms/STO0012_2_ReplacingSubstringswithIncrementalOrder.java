package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0012_2_ReplacingSubstringswithIncrementalOrder 
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
		String str="tomorrow";
		System.out.println("Input: "+str);
		String result=replaceWithString(str,'o',"#");
		System.out.println("Output: "+result);
	}
}