package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.HashMap;
public class STO0022_1_InterviewPrograms
{
	/*
	 * Input:{01IND02AUS03ENG} 
	 * Output: 
	 * { 
	 * "01": IND, 
	 * "02":AUS, 
	 * "03":ENG 
	 * } 
	 * O/P should be printed in json array with key value pair.
	 *
	 */

	public static void main(String[] args) 
	{
		String input = "01IND02AUS03ENG";
		HashMap <String ,String> map= new HashMap <String,String>( );
		String [ ] intArr = input.split("([0-9])+");
		String [ ] StrArr = input.split("([a-z]|[A-Z])+");
		int iCount = 1 ;
		for (String b:StrArr) 
		{
			map.put(b,intArr[iCount]);
			iCount++;
		}
		System.out.println(map);
	}
}
