package com.softwaretestingo.mpradhanpgms;

import java.util.Scanner;

public class PrimeProg {

	public static void main(String[] args) {

		/*String s="monoj1";
		char []m=s.toCharArray();
		for(int i=0;i<m.length;i++)
		{
		}*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num =sc.nextInt();
		
		int count= 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;	        
			}
		}
		if(count==2)
			System.out.println("prime number ");
		else
			System.out.println("Not a prime number ");        
	} 

}
