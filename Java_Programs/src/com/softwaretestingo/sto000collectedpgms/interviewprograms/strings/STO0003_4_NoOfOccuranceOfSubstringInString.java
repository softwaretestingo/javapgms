package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Scanner;
public class STO0003_4_NoOfOccuranceOfSubstringInString 
{
	public  static  int getCountSubString(String str , String sub)
	{
		int n = 0, m = 0, counter = 0, counterSub = 0;
		while(n < str.length())
		{
			counter = 0;
			m = 0;
			while(m < sub.length() && str.charAt(n) == sub.charAt(m))
			{
				counter++;
				m++; n++;
			}
			if (counter == sub.length())
			{
				counterSub++;
				continue;
			}
			else if(counter > 0)
			{
				continue;
			}
			n++;
		}

		return  counterSub;
	}
	public static void main(String[] args) 
	{
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence please:");
		String str = scanner.nextLine();
		System.out.print("Enter a Substring");
		String sub=scanner.next();
		STO0003_4_NoOfOccuranceOfSubstringInString obj=new STO0003_4_NoOfOccuranceOfSubstringInString();
		count=obj.getCountSubString(str, sub);

		System.out.println("Original String: "+str);
		System.out.println("Sub String: "+sub);
		System.out.println("Total Number Of Substring Appears: "+count);
	}
}