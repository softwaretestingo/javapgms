 package com.softwaretestingo.sto021_TYPECASTING;
public class AutoBoxing_Unboxing_Ex 
{ 
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: AutoBoxing and Unboxing Example
	 * Read Here: https://www.softwaretestingo.com/autoboxing-and-unboxing/
	 * @param args
	 */
	public static void main(String[] args) 
	{

		//Unboxing The Object: Wrapper Class Object to Primitive Type
		System.out.println("**************************************");
		System.out.println("Unboxing Example: Integer to int");
		Integer Unboxobj=new Integer(99);
		int ij=Unboxobj;

		System.out.println("The Value Of Unboxobj: "+Unboxobj);
		System.out.println("The Value Of I: "+ij);
		System.out.println("**************************************");

		//AutoBoxing The Object: Primitive Type to Wrapper Class Object
		System.out.println("Autoboxing Example: Int to Integer");
		int i=55;
		Integer jk=i;
		System.out.println("The Value Of I: " +i);
		System.out.println("The Value Of JS: " + jk);
		System.out.println("**************************************");
	}
}  