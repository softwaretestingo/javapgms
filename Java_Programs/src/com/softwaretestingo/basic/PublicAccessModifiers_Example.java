package com.softwaretestingo.basic;
class PQR
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Public Access Modifier Example
	 * Read Here: https://www.softwaretestingo.com/access-modifiers-in-java/
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
		
		//You Can acess Public access modifer variable or methods anywhere
		obj.display();
	}
}