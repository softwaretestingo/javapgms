package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class PerfectSquare 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Perfect Square Number Of The Entered Number
	 * 
	 */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number=sc.nextInt();

        for(int i=0;i<number/2;i++)
        {
            if(i*i==number)
            {
                System.out.println("Given number is square of "+i);
                return;
            }
            else
            {
            	System.out.println("Entered Number is Not Square Of Any Number");
            	break;
            }
        }
    }
}