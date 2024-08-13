package com.softwaretestingo.sto000collectedpgms.numbers;
public class FactorialOfANumber 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Factorial Of A Number 
	 * 
	 */
    public static void main(String [] args)
    {
        int num=5;
        long factorial=1;

        for (int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("The factorial of number is "+factorial);
    }
}