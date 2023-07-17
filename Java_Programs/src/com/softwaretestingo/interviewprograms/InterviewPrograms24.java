package com.softwaretestingo.interviewprograms;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class InterviewPrograms24 
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
		String str = ReadFileAsString("C:\\Users\\ZeroCool\\git\\javapgms\\Java_Programs\\src\\com\\softwaretestingo\\interviewprograms\\getString");
		List<String> matchList = new ArrayList<String>();
		Pattern regex = Pattern.compile("[^\\s\"']+|\"([^\"]*)\"|'([^']*)'");
		Matcher regexMatcher = regex.matcher(str);
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