package com.softwaretestingo.interviewprograms;
import java.util.ArrayList;
import java.util.Scanner;
public class InterviewPrograms16_1 
{
	/*
	 * Input : he is a good boy 
	 * Output: yo bd o ogas ieh
	 */
	public static void main(String[] args) 
	{
		String a = " he is a good boy " ;
		// Output : yo bd o ogas ieh
		String a1 = " " ;
		String result = " " ;
		int k = 1 ;
		ArrayList < Integer > lenArrayList = new ArrayList < > ( ) ;
		Scanner scanner = new Scanner ( a ) ;
		while ( scanner.hasNext ( ) )
		{
			String word = scanner.next ( ) ;
			a1 = a1 + word ;
			lenArrayList.add(word.length());
		}

		for ( int i = 0 ; i <= lenArrayList.size ( ) - 1 ; i ++ )
		{
			for ( int j = 0 ; j <=lenArrayList.get( i ) -1 ; j ++ )
			{
				result= result + a1.charAt(a1.length ( ) - k ) ;
				k ++ ;
			}
			result = result + " " ;
		}
		System.out.println(result);
	}
}