package com.softwaretestingo.interviewprograms;
public class UniqueCharInString 
{
	public static void main(String[] args) 
	{
		String s="softwaretestingo";
		int count;

		for (int i = 0; i < s.length(); i++) 
		{
			count =0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(i) == s.charAt(j) && i!=j)
				{
					count++;
					break;
				}
			}
			if(count ==0)  {
				System.out.print(s.charAt(i));
			}
		}
	}
}