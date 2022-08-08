package com.softwaretestingo.basic;

public class GarbageCollectionEx2 
{
	public static void main(String[] args) 
	{
		// String object referenced by variable str1 and str2 and so these are not eligible for GC yet.
		String str1 = "Welcome to Software";
		String str2 = "Welcome to Testingo"; 
		// String object referenced by variable str1 is eligible for GC.
		str1 = str2; 
	}
}