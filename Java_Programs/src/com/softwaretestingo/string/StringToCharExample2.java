package com.softwaretestingo.string;
import java.util.Arrays;
public class StringToCharExample2 
{
	public static void main(String[] args) 
	{
		String str="Softwaretestingo";  
		
		// create an array of characters 
		char[] strArray = str.toCharArray();

		// print vowelArray
		System.out.println(Arrays.toString(strArray));
	}
}