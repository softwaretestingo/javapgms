package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0002_1_ReverseStringWithOutChangingOrderOfNumbers 
{
	/* Input - today10is20my30interview. 
	 * Output- yadot10si20ym30weivretni.
	 */
	public static void main(String[] args) 
	{
		String input = "today10is20my30interview";
		System.out.println("Input:  "+input);
		StringBuilder res = new StringBuilder ( );
		StringBuilder temp = new StringBuilder ( );
		for ( int i = 0 ; i < input.length ( ) ; i ++ )
		{
			char ch = input.charAt (i);
			if ( Character.isDigit (ch) ) 
			{
				while ( i < input.length ( ) && Character.isDigit ( input.charAt ( i ) ) ) 
				{
					temp.append ( input.charAt ( i ) ) ;
					i ++ ;
				}

				res.append ( temp ) ;
				temp.setLength ( 0 ) ;
				i-- ;
			} 
			else 
			{
				temp.insert ( 0 , ch ) ;
			}
		}

		res.append(temp);
		System.out.println("Output: "+res.toString());
	}
}