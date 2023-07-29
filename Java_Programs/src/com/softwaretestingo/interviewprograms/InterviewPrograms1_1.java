package com.softwaretestingo.interviewprograms;
public class InterviewPrograms1_1 
{
	public static void main(String[] args) 
	{
		String[] strArray = { "Rama", "Test", "Type", "Tata" };
		int maxLength = 0;
		for (String str : strArray) 
		{
			maxLength = str.length();
		}
		String result = "";
		for (int i = 0; i < maxLength; i++) 
		{
			for (String str : strArray) 
			{
				if (i < str.length()) 
				{
					result = result + str.charAt(i);
				}
			}
		}
		System.out.println(result);//RTTTaeyamsptatea
	}
}