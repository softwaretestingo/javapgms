package com.softwaretestingo.basic;
class a112
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Reference Class Variable Example
	 * @param args
	 */
	int i=10;
}
class b112 extends a112
{
	int i=20;
	//int j=40;
}
public class ReferEnceExample 
{
	public static void main(String[] args) 
	{
		a112 obj=new b112();
		// With Parent Class Reference Variable You Can access Override Variables Of Parent Class
		System.out.println("Reference Variable: "+obj.i);
		
		//Newly added variables in child class are not accessible
		//System.out.println(obj.j);
	}
}
