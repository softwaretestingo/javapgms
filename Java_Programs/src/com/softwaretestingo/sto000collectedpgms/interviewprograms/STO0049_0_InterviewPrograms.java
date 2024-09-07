package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0049_0_InterviewPrograms 
{
	/* wap to find the first non repeating character. */
	public static void main(String[] args) 
	{
		String s="minimum";
		System.out.println("Input: "+s);
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
				System.out.println("Output: "+s.charAt(i)+"--"+distinct+"\n");
				break;
			}
			String d=String.valueOf(s.charAt(i)).trim();
			s.replaceAll(d,"");
			distinct=0;
		}
	}
}