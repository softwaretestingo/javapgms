package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class STO0024_0_InterviewPrograms 
{

	/*
	 * Input:- asd fgh dgf "asgh qtyr yty" uiyu "qwe yui" 
	 * Output:- 
	 * asd 
	 * fgh 
	 * dgf
	 * "asgh qtyr yty" 
	 * uiyu 
	 * "qwe yui" 
	 * 
	 * You have break input string into indiviual word without breaking the parts of string that are enclosed in double quotes
	 * 
	 * 
	 * Need to Work On This
	 * NOT WORKING
	 */
	public static void main(String[] args) throws IOException 
	{
		String path = System.getProperty("user.dir")+"\\Resources\\getString";
		System.out.println(path);
		String str = ReadFileAsString(path);
		System.out.println("Input: "+str);
		List<String> matchList = new ArrayList<String>();
		Pattern regex = Pattern.compile("[^\\s\"']+|\"([^\"]*)\"|'([^']*)'");
		Matcher regexMatcher = regex.matcher(str);
		System.out.println("Output: ");
		while (regexMatcher.find())
		{
			if (regexMatcher.group(1) != null ) 
			{
				// Add double quoted string without the quotes
				matchList.add ("\""+regexMatcher.group(1)+"\"");
			} 
			else if(regexMatcher.group(2)!= null) 
			{
				// Add single - quoted string without the quotes
				matchList.add( "'"+regexMatcher.group(2)+"'");
			}
			else
			{	   
				// Add unquoted word
				matchList.add(regexMatcher.group());
			}
			for (int i=0; i<=matchList.size()-1; i++ ) 
			{
				System.out.println(matchList.get(i));
			}

		}

	}

	private static String ReadFileAsString(String filename) throws IOException 
	{
		String data="";
		data=new String(Files.readAllBytes(Paths.get(filename)));
		return data;
	}
}