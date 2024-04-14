package com.softwaretestingo.collectedpgms.numbers;
import java.util.Scanner;
public class PalindromeNumber 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Entered Number is a Palindrome Number
	 * 
	 */
    public static void main(String [] args)
    {
        int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int org_num=num;

        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);

        if(rev==org_num)
        {
          System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not a palindrome ");
        }
    }
}