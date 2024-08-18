package com.softwaretestingo.sto000collectedpgms.numbers;
public class ST000701_CountNoOfDigits1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find The Number Of Digits
	 * 
	 */
    public static void main(String[] args)
    {
        int num=12345;
        int count=0;

        while(num>0)
        {
            num=num/10;
            count ++;
        }
        System.out.println("Number of digits "+count);
    }
}