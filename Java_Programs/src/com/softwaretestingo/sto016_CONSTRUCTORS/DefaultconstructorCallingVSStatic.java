package com.softwaretestingo.sto016_CONSTRUCTORS;
public class DefaultconstructorCallingVSStatic 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Default Constructor & Static Block Example
	 * 
	 */
	DefaultconstructorCallingVSStatic ()
	{
		System.out.println ("Default Constructor Called");
	}
	static
	{
		System.out.println ("Static Block Executed");
	} 
	public static void main (String[]args)
	{
		DefaultconstructorCallingVSStatic obj =
				new DefaultconstructorCallingVSStatic ();
	}
}