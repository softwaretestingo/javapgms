package com.softwaretestingo.interviewprograms;
public class InterviewPrograms43 
{
	/*
	 * Input = “abc”; 
	 * Output = abc,acb,bca,bac,cab,cba,
	 */
	public static void main(String[] args) 
	{
		String str = "abc";
		int n = str.length();
		merge(str, 0, n - 1);
	}
	private static void merge(String str, int lb, int ub)
	{
		if (lb == ub)
			System.out.print(str+",");
		else 
		{
			for (int i = lb; i <= ub; i++) 
			{
				str = swap(str, lb, i);
				merge(str, lb + 1, ub);
				str = swap(str, lb, i);
			}
		}
	}
	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] ch = a.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
}