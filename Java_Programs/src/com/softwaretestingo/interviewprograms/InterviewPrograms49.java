package com.softwaretestingo.interviewprograms;
public class InterviewPrograms49 
{
	/* wap to find the first non repeating character. */
	public static void main(String[] args) 
	{
		String s="minimum";
		int distinct=0;

		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					distinct++;
				}
			}
			if(distinct==1)
			{
				System.out.println(s.charAt(i)+"--"+distinct+"\n");
				break;
			}
			String d=String.valueOf(s.charAt(i)).trim();
			s.replaceAll(d,"");
			distinct=0;
		}
	}
}