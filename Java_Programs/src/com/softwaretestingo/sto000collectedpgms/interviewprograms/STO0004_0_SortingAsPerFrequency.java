package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.LinkedList;
import java.util.List;
public class STO0004_0_SortingAsPerFrequency 
{
	/*
	 * Input string: "dadeadrs" 
	 * Output: "dddaaers"
	 */
	public static void main(String[] args) 
	{
		String s="dadeadrs";
		System.out.println("Input: "+s);
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
		String finals="";
		for ( Character character : ls)
		{
			finals=finals+character;
		}
		System.out.print ("Output: "+finals);
	}
}