package com.softwaretestingo.sto000collectedpgms.numbers;
public class STO0002_0_EvenAndOddCount 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Odd and Even Number Count 
	 * Input: 123456
	 * Even numbers is 3
	 * Odd numbers is 3
	 * 
	 */
    public static void main(String [] args)
    {
        int num=123456;
        System.out.println("Input: "+num);
        int evenCount=0;
        int oddCount=0;
        while(num>0)
        {
            int remainder=num%10;
            if(remainder%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
           num= num/10;
        }
        System.out.println("Even numbers is "+evenCount);
        System.out.println("Odd numbers is "+oddCount);
    }
}