package com.softwaretestingo.sto029_packageexamples;
import static java.lang.System.*; 
public class StaticImportExample 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Static Import Example
	 * 
	 */
	public static void main(String[] args) 
	{
		// We don't need to use 'System.out'
        // Bcoz we have added imported the package by using static.
		out.print("SoftwareTestingo: This Is Example of Static Import");
	}
}