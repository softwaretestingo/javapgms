package com.softwaretestingo.stringmanipulationpgms;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		String reverseString = "", reverseWord = "";
		String str="Welcome to SoftwareTestingo";
		System.out.println("Original String:- "+str);
		String st[]=str.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String word=st[i];
			//System.out.println(word);
			char[] arr=word.toCharArray();
			//System.out.println(Arrays.toString(arr));
			
			for(int j=arr.length-1;j>=0;j--)
			{
				//System.out.print(arr[j]);
				reverseWord=reverseWord+word.charAt(j);
				
				
			}
			reverseString=reverseString+ " "+reverseWord;
			
		}
		System.out.println(reverseString);

	}

}
