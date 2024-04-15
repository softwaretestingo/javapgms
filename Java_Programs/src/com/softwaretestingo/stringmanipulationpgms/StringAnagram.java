package com.softwaretestingo.stringmanipulationpgms;
import java.util.Arrays;
public class StringAnagram 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Compare Two String After Sorting
	 * 
	 */
	public static void main(String[] args) 
	{
		String str1="keEp";
		String str2="peeK";
		
		char arr1[]=str1.toLowerCase().toCharArray();
		char arr2[]=str1.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("1:"+ Arrays.toString(arr1));
		System.out.println("2:"+ Arrays.toString(arr2));
		if(arr1.length==arr2.length)
		{
			boolean status=Arrays.equals(arr1, arr2);
			System.out.println(status);
		}
	}
}