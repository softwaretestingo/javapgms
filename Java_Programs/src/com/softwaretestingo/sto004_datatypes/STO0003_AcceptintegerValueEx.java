package com.softwaretestingo.sto004_datatypes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0003_AcceptintegerValueEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert String to int Using Integer.parseInt()
	 * 
	 */
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Entered a Number");
		String str=br.readLine();
				
		// As readLine Return String Value thats why we need to convert that to int Value
		// It is not able to convert a string to number  
		int number= Integer.parseInt(str);
		System.out.println("Entered Number is : "+number);
	}
}