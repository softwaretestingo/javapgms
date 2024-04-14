package com.softwaretestingo.datatypes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AcceptStringValueEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Read Value From Keyboard Using BufferedReader
	 * 
	 */
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Read a String
		System.out.println("Enter a String: ");
		
		// Here we Don't Need Casting because it taking String and Return String
		String str=br.readLine();		
		System.out.println("You have entered :" + str);
	}
}