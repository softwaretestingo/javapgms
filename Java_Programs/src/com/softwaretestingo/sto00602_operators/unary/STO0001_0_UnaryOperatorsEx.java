package com.softwaretestingo.sto00602_operators.unary;
public class STO0001_0_UnaryOperatorsEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Unary Operator Example
	 * 
	 */
	public static void main(String[] args) 
	{
	      int a = 11, b = 22, c = 33, d = 44; 
	      boolean condition = true; 

	      System.out.println(" Current Value Of A = " + a);
	      System.out.println(" Current Value Of B = " + b);
	      System.out.println(" Current Value Of C = " + c);
	      System.out.println(" Current Value Of D = " + d);

	      // pre-increment operator
	      System.out.println("Value of A after Pre Increment = " + (++a)); 
	      System.out.println(" Current Value Of A = " + a);

	      // post increment operator 
	      System.out.println("Value of B After Post Increment = " + (b++)); 
	      System.out.println(" Current Value Of B = " + b);

	      // pre-decrement operator 
	      System.out.println("Value of C Pre Decrement = " + (--c)); 
	      System.out.println("Current Value of C = " + c); 

	      // post-decrement operator 
	      System.out.println("Value of D after post decrement = " + (d--)); 
	      System.out.println("Current Value of D = " + d); 

	      // Logical not operator 
	      System.out.println("Value of !condition ="+ !condition); 
	}
}
