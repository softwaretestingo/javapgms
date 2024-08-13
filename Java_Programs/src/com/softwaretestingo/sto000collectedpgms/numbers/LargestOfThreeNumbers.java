package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class LargestOfThreeNumbers 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find the Largest Number Using IfElse Statement or Ternary Operator
	 * 
	 */
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int a=sc.nextInt();

        System.out.println("Enter the second Number ");
        int b=sc.nextInt();

        System.out.println("Enter the third Number ");
        int c=sc.nextInt();

        System.out.println("**** Using If Else Statement ******");
        if(a>b && a>c){
            System.out.println(a+ " is the Largest Number ");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is the Largest Number ");
        }
        else{
            System.out.println(c+" is the Largest Number ");
        }

        //Using Ternary Operator
        System.out.println("**** Ternary Operator ******");
        int largest1=a>b?a:b;
        int largest2=c>largest1?c:largest1;

        System.out.println(largest2+" is the largest number");
    }
}
