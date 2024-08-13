package com.softwaretestingo.sto029_packageexamples;
public class Use_FullyqualifiedName 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Fully Qualified Package Example
	 * 
	 */
	public static void main(String[] args) 
	{
		// using fully qualified name  
		myPackage.Add obj=new myPackage.Add();
		System.out.println("Sum Of Two numbers: "+ obj.add(11, 22));
	}
}