package com.softwaretestingo.collectedpgms.numbers;
import java.util.Scanner;
public class ReverseANumber 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Reverse the Entered Number 
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int temp=num;

		// Using While Loop
		int rev = 0;
		while (num > 0) 
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("******* Using Loop **********");
		System.out.println("Original Number is: "+temp);
		System.out.println("Reversed number is " + rev);

		// Using StringBuffer
		num=temp;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer revNum = sb.reverse();
		System.out.println("******* Using StringBuffer **********");
		System.out.println("Original Number is: "+temp);
		System.out.println("Reversed number is " + revNum);

		// Using StringBuilder
		num=temp;
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder revNum1 = sbl.reverse();
		System.out.println("******* Using StringBuilder **********");
		System.out.println("Original Number is: "+temp);
		System.out.println("Reversed number is " + revNum1);
	}
}