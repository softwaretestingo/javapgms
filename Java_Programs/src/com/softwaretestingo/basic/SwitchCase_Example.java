package com.softwaretestingo.basic;

public class SwitchCase_Example 
{
	public static void main(String[] args) 
	{
		int i = 2; 
        switch (i) 
        { 
        case 0: 
            System.out.println("i is zero."); 
            break; 
        case 1: 
            System.out.println("i is one."); 
            break; 
        case 2: 
            System.out.println("i is two."); 
            break; 
        default: 
            System.out.println("i is greater than 2."); 
        } 
	}
}