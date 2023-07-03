package com.softwaretestingo.datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptFloatingValueEx 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Entered a Floating Number");
		String str=br.readLine();
		
		
		// As readLine Return String Value thats why we need to convert that to int Value
		// It is not able to convert a string to number  
		float number= Float.parseFloat(str);
		System.out.println("Entered Floating Number is : "+number);

	}

}
