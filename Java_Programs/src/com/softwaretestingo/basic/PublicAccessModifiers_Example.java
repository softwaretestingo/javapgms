package com.softwaretestingo.basic;
class PQR
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Public Access Modifier Example
	 * @param args
	 */
	public void display()
	{
		System.out.println("Public Method Of Other Class Executed");
	}
}
public class PublicAccessModifiers_Example 
{
	public static void main(String[] args) 
	{
		PQR obj=new PQR();
		obj.display();
	}
}