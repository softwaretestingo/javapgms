package com.softwaretestingo.sto004_DATATYPES;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0005_ConvertCharToInt 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert Char into Int
	 * 
	 */
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Character");
		char ch=(char)br.read();
		
		int num=ch;
		System.out.println("The Ascii or Value Of Entered Characters is: " +num);
	}
}