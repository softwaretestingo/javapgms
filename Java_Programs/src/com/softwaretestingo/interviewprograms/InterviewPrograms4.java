package com.softwaretestingo.interviewprograms;
import java.util.LinkedList;
import java.util.List;
public class InterviewPrograms4 
{
	/*
	 * Input string: "dadeadrs" 
	 * Output: "dddaaers"
	 */
	public static void main(String[] args) 
	{
		String s="dadeadrs";
		List <Character> ls = new LinkedList<>( );
		for(int i=0;i<s.length();i++)
		{
			if(!ls.contains(s.charAt(i)))
			{
				ls.add(s.charAt(i));
				for (int j=i+1; j<s.length(); j++ )
				{
					if ( s.charAt ( i ) == s.charAt ( j ) ) 
					{
						ls.add (s.charAt (j)) ;
					}
				}
			}
		}
		for ( Character character : ls)
		{
			System.out.print (character) ;
		}
	}
}


