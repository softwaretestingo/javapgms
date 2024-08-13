package com.softwaretestingo.sto001_BASIC;
public class GarbageCollectionEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Garbage Collection Example
	 * @param args
	 */
	public void finalize()
	{
		System.out.println("Finalize method called");
	}  
	public static void main(String[] args) 
	{
		GarbageCollectionEx3 obj1=new GarbageCollectionEx3();
		GarbageCollectionEx3 obj2=new GarbageCollectionEx3();
		
		//Objects are eligible for GC
		obj1=null;
		obj2=null;
		System.gc();
	}
}