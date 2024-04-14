package com.softwaretestingo.basic;
public class GarbageCollectionEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Garbage Collection Example
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// String object referenced by variable str thats why its not eligible for GC yet.
		String str = "Welcome to SoftwareTestingo"; 
		// String object referenced by variable str is eligible for GC.
		str = null; 
		System.out.println("str eligible for GC: " + str);
	}
}