package com.softwaretestingo.interviewprograms;
public class InterviewPrograms12_1 
{
	/*
	 * Input: tomorrow 
	 * Output: t#m##rr###w
	 */

	public void getSolution(String input)
	{
		int count = 0;
		String output = "";
		char ch[] = input.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] == 'o')
			{
				count++;
				for(int j=0; j<count; j++)
				{
					output = output+Character.toString(ch[i]);
					output = output.replace(ch[i], '#');
				}
			}
			else {
				output = output+Character.toString(ch[i]);
			}
		}
		System.out.println(output);
	}
	public static void main(String[] args) 
	{
		String s = "tomorrow";
		InterviewPrograms12_1 soluSoultionTest = new InterviewPrograms12_1();
		soluSoultionTest.getSolution(s);
	}
}