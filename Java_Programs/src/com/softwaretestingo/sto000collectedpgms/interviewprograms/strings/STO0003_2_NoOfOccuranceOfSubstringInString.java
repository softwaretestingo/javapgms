package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0003_2_NoOfOccuranceOfSubstringInString 
{
	public static void main(String[] args) 
	{
		String str="abababababaabb";
		String sub = "bab";

		int n = str.length();
		int m = sub.length();

		// index=-1 in case of no match, otherwise >=0(first match position)
		int index=str.indexOf(sub), i=index+1, count=(index>=0)?1:0;
		//System.out.println(i+" "+index+" "+count);

		// i will traverse up to only (m-n) position
		while(index!=-1 && i<=(n-m))
		{   
			index=str.substring(i, n).indexOf(sub);
			count=(index>=0)?count+1:count;
			i=i+index+1;  
			//System.out.println(i+" "+index);
		}
		System.out.println("Original String: "+str);
		System.out.println("Sub String: "+sub);
		System.out.println("Total Number Of Substring Appears: "+count);
	}
}