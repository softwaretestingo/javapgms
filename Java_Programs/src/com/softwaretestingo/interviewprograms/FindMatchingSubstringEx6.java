package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class FindMatchingSubstringEx6 
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
		System.out.println("Enter a sentence please:");
		String str = scanner.nextLine();
		System.out.println("Enter a sentence please:");
		String sub=scanner.next();
		FindMatchingSubstringEx6 obj=new FindMatchingSubstringEx6();
		count=obj.getCountSubString(str, sub);

		System.out.println("Original String: "+str);
		System.out.println("Sub String: "+sub);
		System.out.println("Total Number Of Substring Appears: "+count);
	}
}