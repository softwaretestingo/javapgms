package com.softwaretestingo.sto00406_datatypes.conversionpgms;
import java.util.Scanner;
import java.util.Stack;
public class STO0002_2_DecimaltoBinaryEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert Decimal to Binary
	 * 
	 */
	public static void main(String[] args) 
	{
		// Create Stack object
		Stack<Integer> stack = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);
		// User input 
		System.out.println("Enter decimal number: ");
		int num = sc.nextInt();

		while (num != 0)
		{
			int d = num % 2;
			stack.push(d);
			num /= 2;
		} 
		System.out.print("\nBinary representation is: ");
		while (!(stack.isEmpty() ))
		{
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}