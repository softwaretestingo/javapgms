package com.softwaretestingo.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Split a String With the Help Of StringTokenizer() 
	 * 
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a String");
		String str=br.readLine();
		
		StringTokenizer st=new StringTokenizer(str," ");
		
		String str1=st.nextToken();
		String str2=st.nextToken();
		String str3=st.nextToken();
		
		System.out.println(" Word 1 " +str1);
		System.out.println(" Word 2 " +str2);
		System.out.println(" Word 3 " +str3);
	}

}
