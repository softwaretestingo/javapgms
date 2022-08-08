package com.softwaretestingo.packageexamples;
import static java.lang.System.*; 
public class StaticImportExample 
{
	public static void main(String[] args) 
	{
		// We don't need to use 'System.out'
        // Bcoz we have added imported the package by using static.
		out.print("SoftwareTestingo: This Is Example of Static Import");
	}
}