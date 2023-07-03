package com.softwaretestingo.basic;

public class AutoBoxing_Unboxing_Ex 
{
	public static void main(String[] args) 
	{

		//Unboxing The Object
		System.out.println("**************************************");
		System.out.println("Unboxing Example: Integer to int");
		Integer Unboxobj=new Integer(99);
		int ij=Unboxobj;

		System.out.println("The Value Of Unboxobj: "+Unboxobj);
		System.out.println("The Value Of I: "+ij);
		System.out.println("**************************************");

		//AutoBoxing The Object
		System.out.println("Autoboxing Example: Int to Integer");
		int i=55;
		Integer jk=i;
		System.out.println("The Value Of I: " +i);
		System.out.println("The Value Of JS: " + jk);
		System.out.println("**************************************");
	}
}