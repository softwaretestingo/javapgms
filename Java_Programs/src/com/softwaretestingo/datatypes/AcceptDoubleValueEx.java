package com.softwaretestingo.datatypes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AcceptDoubleValueEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert String to Double Using Double.parseDouble()
	 * 
	 */
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Entered a Double Value");
		String str=br.readLine();
		
		// As readLine Return String Value thats why we need to convert that to int Value
		// It is not able to convert a string to number  
		double number= Double.parseDouble(str);
		System.out.println("Entered Double Value is : "+number);
	}
}