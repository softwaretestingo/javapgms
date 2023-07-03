package com.softwaretestingo.datatypes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadSingleCharacterEx1 
{
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