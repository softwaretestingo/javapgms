package com.softwaretestingo.sto000collectedpgms.numbers;
//without using third variable
public class SwapTwoNumbers
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Swap Two Numbers With & Without Third Variable
	 * 
	 */
    public void swapWithoutThirdVariable()
    {
        int a=10;
        int b=20;
        a=a+b;//10+20=30
        b=a-b;//30-20=10
        a=a-b;
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " +b);
    }

    public void withThirdVariable()
    {
        int a=10;
        int b=20;
        int temp;
        temp=a;//temp=10
        a=b;//a=20
        b=temp;//b=10
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
    SwapTwoNumbers swapTwoNumbers=new SwapTwoNumbers();
    swapTwoNumbers.swapWithoutThirdVariable();
    swapTwoNumbers.withThirdVariable();
    }
}