package com.softwaretestingo.conversionprograms;
import java.util.Scanner;
import java.util.Stack;
public class DecimaltoBinaryEx3 
{
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
		System.out.print("\nBinary representation is:");
		while (!(stack.isEmpty() ))
		{
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}