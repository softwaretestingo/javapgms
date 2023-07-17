package com.softwaretestingo.interviewprograms;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
public class InterviewPrograms22
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
	 * Download Jar File From Here: https://code.google.com/archive/p/json-simple/downloads
	 * After that Add the Jar File In the Java Project build Path:  (right-click on the project, Properties->Libraries and add new JAR.)
	 */

	public static void main(String[] args) 
	{
		String s = "01IND02AUS03ENG";
		InterviewPrograms22 solution = new InterviewPrograms22();
		solution.getSolution(s);
	}
	public void getSolution(String test)
	{
		String word[] = test.split("([0-9])+");
		String num[] = test.split("([a-zA-z])+");
		Map<String, String> hasmMap = new HashMap<String, String>();
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<=i+1; j++)
			{
				hasmMap.put(num[i], word[j]);
			}
		} 
		JSONObject data = new JSONObject(hasmMap);
		System.out.println(data);
	}
}