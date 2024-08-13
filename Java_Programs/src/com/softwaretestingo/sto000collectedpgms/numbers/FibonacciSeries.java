package com.softwaretestingo.sto000collectedpgms.numbers;
public class FibonacciSeries 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the First 10 Fibonacci Series Number 
	 * 
	 */
    public static void main(String [] args)
    {
        int n1=0,n2=1,sum=0;
        for (int i=2;i<12;i++)
        {
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }
}