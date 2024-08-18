package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class ST000903_ReverseNumberEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Reverse a Number
	 * 
	 */
	public static void main(String[] args) 
	{
		int num=0;
		int reversenum =0;
		System.out.println("Input your number and press enter: ");
		//This statement will capture the user input
		Scanner in = new Scanner(System.in);
		//Captured input would be stored in number num
		num = in.nextInt();
		System.out.println ("Reversed Number: " + getReverse(num, reversenum));
	}
	static int getReverse (int num, int rev)
	{
		if (num == 0)
			return rev;

		int rem = num % 10;
		rev = rev * 10 + rem;

		return getReverse (num / 10, rev);
	}
}