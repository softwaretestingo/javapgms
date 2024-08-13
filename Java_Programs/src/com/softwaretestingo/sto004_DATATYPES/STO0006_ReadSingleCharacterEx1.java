package com.softwaretestingo.sto004_DATATYPES;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0006_ReadSingleCharacterEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Read Single Character From Keyboard
	 * 
	 */
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a Single Character: ");
		
		//By Default It Was Reading As Input, That's why we have narrowing here
		// If You enter a String also it will take a single character
		char ch=(char)br.read();
		
		System.out.println("You Have Entered: "+ ch);
	}
}