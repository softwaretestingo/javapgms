package com.softwaretestingo.constructor;
public class DefaultconstructorCallingVSStatic 
{
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