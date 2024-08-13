package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class ReverseNumberEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Reverse Number Is for Loop
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
		//While Loop: Logic to find out the reverse number
		
		//loop to find reverse number
        for( ;num != 0;)
        {
        	reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        };

		System.out.println("Reverse of input number is: "+reversenum);
	}
}