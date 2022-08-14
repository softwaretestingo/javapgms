package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindMatchingSubstringEx4 
{
	static int countMatches(Pattern pattern, String string)
	{
		Matcher matcher = pattern.matcher(string);

		int count = 0;
		int pos = 0;
		while (matcher.find(pos))
		{
			count++;
			pos = matcher.start() + 1;
		}

		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence please:");
		String str = sc.nextLine();
		System.out.println("Enter a sentence please:");
		String sub=sc.next();
		Pattern pattern = Pattern.compile(sub);
		int count = countMatches(pattern, str);
		System.out.println("No Of Times Sub String Appears:-"+count);
	}
}